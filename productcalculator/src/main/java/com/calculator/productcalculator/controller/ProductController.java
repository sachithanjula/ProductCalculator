package com.calculator.productcalculator.controller;

import com.calculator.productcalculator.dto.ProductDTO;
import com.calculator.productcalculator.entity.Product;
import com.calculator.productcalculator.response.ResponseMessage;
import com.calculator.productcalculator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ProductController
{

    @Autowired
    ProductService productService;

    @GetMapping
    private String commonIndex()
    {
        return "service is running";
    }

    @GetMapping("get-products")
    List<Product> getAllProducts()
    {
       return productService.getAllProducts();
    }

    @PostMapping("save-product")
    ResponseMessage saveProduct(@RequestBody ProductDTO productDTO)
    {
        return productService.saveProduct(productDTO);
    }

    @PostMapping("get-price")
    double getProductPrice(@RequestParam String productName, @RequestParam String productType, @RequestParam int qty)
    {
        return productService.getProductPrice(productName, productType, qty);
    }

}
