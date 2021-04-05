package com.cursor.hw.hw3.problem2.product.electronicsProduct;

import com.cursor.hw.hw3.problem2.customer.AgeRestriction;
import com.cursor.hw.hw3.problem2.product.Product;

public class ElectronicsProduct extends Product {

    private int guaranteedPeriod;

    public ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public int getGuaranteedPeriod() {
        return guaranteedPeriod;
    }

    public void setGuaranteedPeriod(int guaranteedPeriod) {
        this.guaranteedPeriod = guaranteedPeriod;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                ", guaranteedPeriod=" + this.guaranteedPeriod +
                '}';
    }
}
