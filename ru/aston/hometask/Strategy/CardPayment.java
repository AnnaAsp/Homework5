package aston.hometask.Strategy;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.printf("Оплачено картой: %.2f руб.\n", amount);
    }
}
