package aston.hometask.Adapter;

public class CoffeeShop {
    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();

        ModernCoffeeMachine adaptedMachine = new CoffeeAdapter(oldMachine);

        adaptedMachine.prepareCoffee("Латте", true);
    }
}
