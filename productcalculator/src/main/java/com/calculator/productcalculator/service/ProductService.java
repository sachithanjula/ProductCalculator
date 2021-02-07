package com.calculator.productcalculator.service;

import com.calculator.productcalculator.dto.ProductDTO;
import com.calculator.productcalculator.entity.Product;
import com.calculator.productcalculator.response.ResponseMessage;

import java.util.List;

public interface ProductService
{
    ResponseMessage saveProduct(ProductDTO productDTO);

    List<Product> getAllProducts();

    double getProductPrice(String productName, String productType, int quantity);
}
