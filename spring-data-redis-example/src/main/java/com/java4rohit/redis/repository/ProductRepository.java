package com.java4rohit.redis.repository;

import com.java4rohit.redis.entity.Product;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Long> {
    Optional<Product> findByBarcode(String barcode);
}
