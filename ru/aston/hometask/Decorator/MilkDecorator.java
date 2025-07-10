package aston.hometask.Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", молоко";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 50.0;
    }
}
