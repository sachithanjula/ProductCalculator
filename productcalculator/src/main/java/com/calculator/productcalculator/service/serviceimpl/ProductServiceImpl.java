package com.calculator.productcalculator.service.serviceimpl;

import com.calculator.productcalculator.dto.ProductDTO;
import com.calculator.productcalculator.entity.Product;
import com.calculator.productcalculator.repository.ProductRepository;
import com.calculator.productcalculator.response.ResponseMessage;
import com.calculator.productcalculator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ResponseMessage saveProduct(ProductDTO productDTO)
    {
        ResponseMessage responseMessage = null;
        Product product = null;

        try
        {
            if (productDTO != null)
            {
                product = new Product(productDTO.getProductName(), productDTO.getCartonUnits(), productDTO.getCartonPrice(), productDTO.getUnitPrice());
                productRepository.save(product);

                responseMessage = new ResponseMessage(200, "save successfully");
            }
            else
            {
                responseMessage = new ResponseMessage(201, "save fail");
            }
            return responseMessage;
        }
        catch (Exception e)
        {
            responseMessage = new ResponseMessage(500, e.toString());
            return responseMessage;
        }

    }

    @Override
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    @Override
    public double getProductPrice(String productName, String productType, int quantity)
    {

        double price = 0;

        Product byProductName = productRepository.findByProductName(productName);

        System.out.println(byProductName.toString());


        if (productType.equals("unit"))
        {

            int units = quantity % byProductName.getCartonUnits();
            int numberOfCartons = quantity / byProductName.getCartonUnits();

            System.out.println(numberOfCartons);
            System.out.println(units);

            if (units > 0)
            {
                double cartonPrice = calculateCartonPrice(byProductName, numberOfCartons);
                double unitPrice = units * byProductName.getUnitPrice();

                price = cartonPrice + unitPrice;

            }
            else
            {
                price = calculateCartonPrice(byProductName, numberOfCartons);
            }

        }
        else if (productType.equals("carton"))
        {
            price =  calculateCartonPrice(byProductName, quantity);
        }

        return price;

    }

    public double calculateCartonPrice(Product product,int quantity)
    {

        double calculatePrice = 0;

        if (quantity >= 3)
        {
            calculatePrice = (product.getCartonPrice() * quantity) * 0.9;
        }
        else
        {
            calculatePrice = product.getCartonPrice() * quantity;
        }
        return calculatePrice;

    }
}
