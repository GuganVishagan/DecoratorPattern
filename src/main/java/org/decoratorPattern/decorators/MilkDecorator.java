package org.decoratorPattern.decorators;

import org.decoratorPattern.models.Coffee;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public double getPrice() {
        return super.getPrice() + 5;
    }
}
