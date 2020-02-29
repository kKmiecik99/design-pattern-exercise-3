package main;

import factory.PizzaFactory;
import factory.PizzaType;
import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory= new PizzaFactory();
        pizzaFactory.createPizza(PizzaType.CAPRICIOSA);
        pizzaFactory.createPizza(PizzaType.HAWAI);
        pizzaFactory.createPizza(PizzaType.MARGHERITA);

        System.out.println(new CapriciosaPizza().toString());
        System.out.println(new HawaiPizza().toString());
        System.out.println(new MargheritaPizza().toString());
    }

}
