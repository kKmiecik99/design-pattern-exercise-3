package pizza;

import factory.Pizza;
import factory.PizzaType;

import java.util.Arrays;
import java.util.List;

public class HawaiPizza extends Pizza {
    public HawaiPizza() {
        super(29.99, Arrays.asList("cheese","pineaple","ham"), PizzaType.HAWAI);
    }
}
