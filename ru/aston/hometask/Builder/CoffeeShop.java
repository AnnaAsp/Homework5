package aston.hometask.Builder;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee cappuccino = new Coffee.Builder("Капучино")
                .sugar(true)
                .milk(true)
                .build();

        Coffee espresso = new Coffee.Builder("Эспрессо")
                .syrup("Ванильный")
                .build();

        System.out.println("Заказ 1: " + cappuccino.getType() +
                ", сахар: " + cappuccino.hasSugar() +
                ", молоко: " + cappuccino.hasMilk());

        System.out.println("Заказ 2: " + espresso.getType() +
                ", сироп: " + espresso.getSyrup());
    }
}
