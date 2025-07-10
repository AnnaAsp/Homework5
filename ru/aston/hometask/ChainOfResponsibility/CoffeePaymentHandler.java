package aston.hometask.ChainOfResponsibility;

public abstract class CoffeePaymentHandler {
    CoffeePaymentHandler next;
    int billValue;

    void setNext(CoffeePaymentHandler next) {
        this.next = next;
    }

    void handlePayment(int amount) {
        int count = amount / billValue;
        if (count > 0) {
            System.out.println("Принято " + count + " × " + billValue + " руб.");
            amount -= count * billValue;
        }
        if (amount == 0) {
            System.out.println("Кофе готов! Заберите ваш напиток");
        } else if (next != null) {
            next.handlePayment(amount);
        } else {
            System.out.println("Не хватает: " + amount + " руб.");
        }
    }
}
