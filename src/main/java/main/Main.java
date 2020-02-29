package main;

import factory.Pizza;
import factory.PizzaFactory;
import factory.PizzaType;
import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.createPizza(PizzaType.HAWAI);
        Pizza pizza2 = PizzaFactory.createPizza(PizzaType.MARGHERITA);
        Pizza pizza3 = PizzaFactory.createPizza(PizzaType.CAPRICIOSA);
        System.out.println(pizza.toString());
        System.out.println(pizza2.toString());
        System.out.println(pizza3.toString());
    }

}
