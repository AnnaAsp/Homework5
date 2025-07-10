package aston.hometask.Decorator;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
