package com.cursor.hw.hw3.problem2.product.electronicsProduct;

import com.cursor.hw.hw3.problem2.customer.AgeRestriction;

public class Computer extends ElectronicsProduct{
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        setGuaranteedPeriod(24);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                ", guaranteedPeriod=" + super.getGuaranteedPeriod() +
                '}';
    }
}
