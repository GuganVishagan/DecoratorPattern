package org.decoratorPattern.decorators;

import org.decoratorPattern.models.Coffee;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
