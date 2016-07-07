package com.realdolmen.StarMaleDeers;

/**
 * Created by aryastark on 07/07/16.
 */
public class Feces extends CondimentDecorator{
    Beverage beverage;

    public Feces(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", shitty";
    }

    @Override
    public double cost() {
        return .69 + beverage.cost();
    }
}
