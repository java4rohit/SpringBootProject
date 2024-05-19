package com.elk.elesticSearchAndLogging.service;

import com.elk.elesticSearchAndLogging.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {


    public List<Product> getProducts();

    public Product create(Product product);

    public Product update(Product product);

    public Product deleteById(int id);
}
