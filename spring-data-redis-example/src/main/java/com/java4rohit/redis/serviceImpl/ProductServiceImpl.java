package com.java4rohit.redis.serviceImpl;

import com.java4rohit.redis.entity.Product;
import com.java4rohit.redis.exception.CustomerAlreadyExistsException;
import com.java4rohit.redis.exception.ResourceNotFoundException;
import com.java4rohit.redis.repository.ProductRepository;
import com.java4rohit.redis.service.ProductService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        Optional<Product> optionalProduct = productRepository.findByBarcode(product.getBarcode());
        if (optionalProduct.isPresent()) {
            throw new CustomerAlreadyExistsException("Product already registered with given Product Barcode " + product.getBarcode());
        }
        return productRepository.save(product);
    }

    @Override
    @Cacheable(value = "products", key = "#id")
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Product", "productId", id.toString()));
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    @CacheEvict(value = "products", key = "#id")
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Product is deleted";
    }

    @Override
    @CacheEvict(value = "products", allEntries = true)
    public List<Product> saveAll(List<Product> products) {

        return (List<Product>) productRepository.saveAll(products);
    }
}
