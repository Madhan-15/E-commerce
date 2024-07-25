package com.ecommerce.strategies;

public class BuyOneGetOneFreeStrategy implements DiscountStrategy {
    @Override
    //single parame
    public double applyDiscount(double price) {
        // Assuming the discount is for buying two items and getting the second free
        return price / 2;
    }
}
