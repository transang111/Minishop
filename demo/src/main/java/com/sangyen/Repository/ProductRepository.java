package com.sangyen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sangyen.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
