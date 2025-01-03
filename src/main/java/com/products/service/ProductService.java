package com.products.service;



import com.products.data.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products;

    public ProductService() {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getResourceAsStream("/products.json")) {
            products = objectMapper.readValue(inputStream, new TypeReference<>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to load products.json", e);
        }
    }

    public Optional<Product> getProductById(int productId) {
        return products.stream().filter(p -> p.getProductId() == productId).findFirst();
    }
}
