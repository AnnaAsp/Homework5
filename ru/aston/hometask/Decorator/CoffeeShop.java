package aston.hometask.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.getDescription() + " = " + espresso.getCost() + " руб.");

        Coffee latte = new MilkDecorator(new Espresso());
        System.out.println(latte.getDescription() + " = " + latte.getCost() + " руб.");

        Coffee customCoffee = new SyrupDecorator(new MilkDecorator(new Espresso()));
        System.out.println(customCoffee.getDescription() + " = " + customCoffee.getCost() + " руб.");
    }
}
