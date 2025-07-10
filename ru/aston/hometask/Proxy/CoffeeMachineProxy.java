package aston.hometask.Proxy;

public class CoffeeMachineProxy implements SmartCoffeeMachine {
    private RealCoffeeMachine realMachine;
    private boolean isAdmin;

    public CoffeeMachineProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public void makeCoffee(String type) {
        if (realMachine == null) {
            realMachine = new RealCoffeeMachine();
        }
        realMachine.makeCoffee(type);
    }

    @Override
    public void addWater(int ml) {
        if (!isAdmin) {
            System.out.println("Ошибка: Только администратор может доливать воду!");
            return;
        }
        if (realMachine == null) {
            realMachine = new RealCoffeeMachine();
        }
        realMachine.addWater(ml);
    }
}
