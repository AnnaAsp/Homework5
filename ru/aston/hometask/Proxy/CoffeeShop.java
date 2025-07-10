package aston.hometask.Proxy;

public class CoffeeShop {
    public static void main(String[] args) {
        SmartCoffeeMachine userMachine = new CoffeeMachineProxy(false);
        userMachine.makeCoffee("эспрессо");
        userMachine.addWater(100);

        SmartCoffeeMachine adminMachine = new CoffeeMachineProxy(true);
        adminMachine.makeCoffee("капучино");
        adminMachine.addWater(200);
    }
}
