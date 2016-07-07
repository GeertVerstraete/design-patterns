package com.realdolmen.StarMaleDeers;

/**
 * Created by aryastark on 07/07/16.
 */
public class OhDeerRunner {
    public static void main(String[] args) {
        Beverage rage=new Mocha(new DarkRoast());
        Beverage bever=new Feces(new Mocha(new Milk(new Espresso())));
        System.out.println(rage.getDescription() +  " " + rage.cost());
        System.out.println(bever.getDescription() +  " " + bever.cost());
    }
}
