package com.cursor.hw.hw3.problem2.product;

import com.cursor.hw.hw3.problem2.customer.interfaces.Buyable;
import com.cursor.hw.hw3.problem2.customer.AgeRestriction;
import java.util.Date;


public class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private AgeRestriction ageRestriction;

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    private static Date localTime;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public Date getLocalTime() {
        return localTime;
    }

    public static void setLocalTime(Date time) {
        localTime = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public double getPrice() {
        return price;
    }
}
