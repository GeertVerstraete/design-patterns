package com.realdolmen.StarMaleDeers;

/**
 * Created by aryastark on 07/07/16.
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", mochaa";
    }

    @Override
    public double cost() {
        return .50 + beverage.cost();
    }
}
