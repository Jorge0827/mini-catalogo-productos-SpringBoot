package com.jechavarria.catalogo.mini_catalogo_productos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jechavarria.catalogo.mini_catalogo_productos.model.ProductDto;

@RestController // Indica que es un controlador de Spring
@RequestMapping("/api/products")
public class ProductController {

    private List<ProductDto> products = new ArrayList<>();

    public ProductController() {
        // Agregando algunos productos de ejemplo
        products.add(new ProductDto(1, "Laptop", 999.99));
        products.add(new ProductDto(2, "Smartphone", 599.99));
        products.add(new ProductDto(3, "Tablet", 299.99));
        products.add(new ProductDto(4, "Mouse", 19.99));
        products.add(new ProductDto(5, "Keyboard", 29.99));
        products.add(new ProductDto(6, "Monitor", 149.99));
        products.add(new ProductDto(7, "Headphones", 49.99));
        products.add(new ProductDto(8, "Speaker", 79.99));
        products.add(new ProductDto(9, "Webcam", 24.99));
        products.add(new ProductDto(10, "Microphone", 14.99));

    }

    @GetMapping // Método GET para obtener todos los productos
    public List<ProductDto> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}") // Método GET para obtener un producto por su ID
    public ProductDto getProductById(@PathVariable int id) {
        for (ProductDto productDto : products) {
                return products.get(id);
        }
        return null;

    }

    @PostMapping // Método POST para crear un nuevo producto
    public ProductDto createProduct(@RequestBody ProductDto newProductDto) { // @RequestBody indica que el cuerpo de la petición se convertirá en un objeto ProductDto
        products.add(newProductDto);
        return newProductDto;
    }

    @DeleteMapping("/{id}") // Método DELETE para eliminar un producto por su ID
    public void deleteProduct(@PathVariable int id) {
        products.remove(id);
    }

    @PutMapping("/{id}") // Método PUT para actualizar un producto por su ID
    public ProductDto updateProduct(@PathVariable int id, @RequestBody ProductDto updatedProductDto) {
        products.set(id, updatedProductDto);
        return updatedProductDto;

    }
}
