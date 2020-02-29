package pizza;

import factory.Pizza;
import factory.PizzaType;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza extends Pizza {



    public CapriciosaPizza() {
        super(31.99,Arrays.asList("cheese","champignons","ham"), PizzaType.CAPRICIOSA);
    }


}
