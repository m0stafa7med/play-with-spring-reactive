package com.mostafa.reactive.repo;

import com.mostafa.reactive.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
}
