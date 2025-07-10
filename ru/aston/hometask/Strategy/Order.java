package aston.hometask.Strategy;

public class Order {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod method) {
        this.paymentMethod = method;
    }

    public void checkout(double amount) {
        System.out.printf("Итого: %.2f руб.\n", amount);
        paymentMethod.pay(amount);
        System.out.println("Спасибо за заказ!");
    }
}
