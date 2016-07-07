package com.realdolmen.StarMaleDeers;

/**
 * Created by aryastark on 07/07/16.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milky";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
