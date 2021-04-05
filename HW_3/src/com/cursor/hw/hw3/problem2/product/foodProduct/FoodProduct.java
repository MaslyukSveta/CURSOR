package com.cursor.hw.hw3.problem2.product.foodProduct;

import com.cursor.hw.hw3.problem2.customer.AgeRestriction;
import com.cursor.hw.hw3.problem2.customer.interfaces.Expirable;
import com.cursor.hw.hw3.problem2.product.Product;

import java.util.Date;


public class FoodProduct extends Product implements Expirable{

    private Date expirationDate;
    private AgeRestriction ageRestriction;


    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }


    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double returnMoney() {
        if (expirationDate.getDay() > getLocalTime().getDay() + 15) {
            return getPrice() * 0.7;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Product: " + getName() + "\nPrice: " + getPrice()
                + "\nShelf life: " + expirationDate.toGMTString()
                + "\nGuantity: " + getQuantity() + "\nProduct's type: " + getAgeRestriction().name();
    }


}
