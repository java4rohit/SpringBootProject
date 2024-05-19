package com.java4rohit.redis.repository;

import com.java4rohit.redis.entity.Product;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@EnableRedisRepositories
public interface ProductRepository extends CrudRepository<Product,Long> {


}
