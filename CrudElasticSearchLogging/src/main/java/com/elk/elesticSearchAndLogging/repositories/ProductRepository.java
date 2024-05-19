package com.elk.elesticSearchAndLogging.repositories;

import com.elk.elesticSearchAndLogging.entities.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {
}
