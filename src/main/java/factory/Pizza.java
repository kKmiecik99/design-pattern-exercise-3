package factory;

import pizza.CapriciosaPizza;

import java.util.List;

public class Pizza {
    private PizzaType pizzaType;
    private double cost;
    private List<String> components;

    public Pizza(double cost, List<String> components, PizzaType pizzaType) {
        this.cost=cost;
        this.components=components;
        this.pizzaType=pizzaType;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return
                 pizzaType +
                "{ cost=" + cost +
                ", components=" + components +
                '}';
    }
}
