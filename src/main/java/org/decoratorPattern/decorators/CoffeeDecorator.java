package org.decoratorPattern.decorators;

import org.decoratorPattern.models.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getPrice() {
        return coffee.getPrice();
    }

}
