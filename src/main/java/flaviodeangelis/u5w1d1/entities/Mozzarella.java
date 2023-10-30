package flaviodeangelis.u5w1d1.entities;

public class Mozzarella extends Topping {


    public Mozzarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + " con extra mozzarella";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.50;
    }
}
