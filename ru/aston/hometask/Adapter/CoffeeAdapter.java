package aston.hometask.Adapter;

public class CoffeeAdapter implements ModernCoffeeMachine {
    private OldCoffeeMachine oldMachine;

    public CoffeeAdapter(OldCoffeeMachine oldMachine) {
        this.oldMachine = oldMachine;
    }

    @Override
    public void prepareCoffee(String coffeeType, boolean withSugar) {
        int sugar = withSugar ? 2 : 0;
        oldMachine.makeCoffee(coffeeType, sugar);
    }
}
