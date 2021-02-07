package com.calculator.productcalculator.dto;

public class ProductDTO
{
    private String productName;
    private int cartonUnits;
    private double cartonPrice;
    private double unitPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCartonUnits() {
        return cartonUnits;
    }

    public void setCartonUnits(int cartonUnits) {
        this.cartonUnits = cartonUnits;
    }

    public double getCartonPrice() {
        return cartonPrice;
    }

    public void setCartonPrice(double cartonPrice) {
        this.cartonPrice = cartonPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productName='" + productName + '\'' +
                ", cartonPrice=" + cartonPrice +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
