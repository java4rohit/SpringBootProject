package com.java4rohit.redis.serviceImpl;

import com.java4rohit.redis.entity.Product;
import com.java4rohit.redis.repository.ProductRepository;
import com.java4rohit.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return  "Product Is Deleted";
    }

    @Override
    public List<Product> saveAll(List<Product> products) {
        return (List<Product>) productRepository.saveAll(products);
    }
}
