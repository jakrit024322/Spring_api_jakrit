package com.example.ppppp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ppppp.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    public List<Product> findByNameContaining(String name);
}
