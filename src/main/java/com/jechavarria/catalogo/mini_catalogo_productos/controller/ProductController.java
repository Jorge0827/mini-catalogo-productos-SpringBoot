package com.jechavarria.catalogo.mini_catalogo_productos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jechavarria.catalogo.mini_catalogo_productos.model.ProductDto;

@RestController // Indica que es un controlador de Spring
@RequestMapping("/api/products")
public class ProductController {

    private List<ProductDto> products = new ArrayList<>();

    public ProductController() {
        // Agregando algunos productos de ejemplo
        products.add(new ProductDto(1L, "Laptop", 999.99));
        products.add(new ProductDto(2L, "Smartphone", 599.99));
        products.add(new ProductDto(3L, "Tablet", 299.99));
        products.add(new ProductDto(4L, "Mouse", 19.99));
        products.add(new ProductDto(5L, "Keyboard", 29.99));
        products.add(new ProductDto(6L, "Monitor", 149.99));
        products.add(new ProductDto(7L, "Headphones", 49.99));
        products.add(new ProductDto(8L, "Speaker", 79.99));
        products.add(new ProductDto(9L, "Webcam", 24.99));
        products.add(new ProductDto(10L, "Microphone", 14.99));

    }

    @GetMapping 
    public List<ProductDto> getAllProducts() {
        return products;
    }

}
