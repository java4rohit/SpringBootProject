package com.elk.elesticSearchAndLogging.serviceImpl;

import com.elk.elesticSearchAndLogging.entities.Product;
import com.elk.elesticSearchAndLogging.repositories.ProductRepository;
import com.elk.elesticSearchAndLogging.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        Optional<Product> existingProduct = productRepository.findById(product.getId());
        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setName(product.getName());
            updatedProduct.setPrice(product.getPrice());
            return productRepository.save(updatedProduct);
        } else {
            // Product with given id not found
            return null;
        }
    }

    @Override
    public Product deleteById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            productRepository.deleteById(id);
            return product.get();
        } else {
            // Product with given id not found
            return null;
        }
    }
}
