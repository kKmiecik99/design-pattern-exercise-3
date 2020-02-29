package factory;

import pizza.CapriciosaPizza;
import pizza.HawaiPizza;
import pizza.MargheritaPizza;
import factory.PizzaType;
public class PizzaFactory {
public Pizza createPizza(PizzaType pizzaType){
if(PizzaType.CAPRICIOSA.equals(pizzaType)){
    return new CapriciosaPizza();
} else if(PizzaType.HAWAI.equals(pizzaType)){
    return new HawaiPizza();
} else if (PizzaType.MARGHERITA.equals(pizzaType)){
    return new MargheritaPizza();
}
throw new IllegalArgumentException("There is not this type of pizza in our menu.");
}

}
