package aston.hometask.Strategy;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.printf("Оплачено наличными: %.2f руб.\n", amount);
    }
}
