package aston.hometask.Proxy;

public class RealCoffeeMachine implements SmartCoffeeMachine {
    @Override
    public void makeCoffee(String type) {
        System.out.println("Приготовлен " + type);
    }

    @Override
    public void addWater(int ml) {
        System.out.println("Добавлено " + ml + " мл. воды");
    }
}
