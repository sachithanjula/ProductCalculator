package com.calculator.productcalculator.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable
{

    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "CartonUnits")
    private int cartonUnits;

    @Column(name = "CartonPrice")
    private double cartonPrice;

    @Column(name = "UnitPrice")
    private double unitPrice;

    public Product() {
    }

    public Product(String productName, int cartonUnits, double cartonPrice, double unitPrice) {
        this.productName = productName;
        this.cartonUnits = cartonUnits;
        this.cartonPrice = cartonPrice;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartonUnits() {
        return cartonUnits;
    }

    public void setCartonUnits(int cartonUnits) {
        this.cartonUnits = cartonUnits;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", cartonUnits=" + cartonUnits +
                ", cartonPrice=" + cartonPrice +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
