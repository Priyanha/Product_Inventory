package com.example.ProductCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductCrud.domain.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
 
}