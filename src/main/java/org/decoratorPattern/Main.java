package org.decoratorPattern;

import org.decoratorPattern.decorators.CoffeeDecorator;
import org.decoratorPattern.decorators.MilkDecorator;
import org.decoratorPattern.decorators.SugarDecorator;
import org.decoratorPattern.models.Coffee;
import org.decoratorPattern.models.SimpleCoffee;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.getPrice());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " = " + coffee.getPrice());
        coffee  = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + "=" + coffee.getPrice());


    }
}