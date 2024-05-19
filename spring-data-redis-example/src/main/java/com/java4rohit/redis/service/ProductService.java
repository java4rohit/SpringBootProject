package com.java4rohit.redis.service;

import com.java4rohit.redis.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product save(Product product);

    List<Product> saveAll(List<Product> products);
    public String delete(Long id);

    public Product findById(Long id);
    public List<Product> getAllProducts();
}
