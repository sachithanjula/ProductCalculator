package com.calculator.productcalculator.repository;

import com.calculator.productcalculator.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
    Product findByProductName(String productName);
}
