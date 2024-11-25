package org.decoratorPattern.models;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
