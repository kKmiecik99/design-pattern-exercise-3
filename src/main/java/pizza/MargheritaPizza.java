package pizza;

import factory.Pizza;
import factory.PizzaType;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza {

    public MargheritaPizza() {
      super(24, Arrays.asList("cheese"), PizzaType.MARGHERITA);
    }
}
