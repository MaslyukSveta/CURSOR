package com.cursor.hw.hw3.problem2.product.electronicsProduct;


import com.cursor.hw.hw3.problem2.customer.AgeRestriction;

public class Appliance extends ElectronicsProduct{

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        setGuaranteedPeriod(6);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() < 50) {
            return super.getPrice() * 1.05;
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
