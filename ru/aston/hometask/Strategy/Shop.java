package aston.hometask.Strategy;

public class Shop {
    public static void main(String[] args) {
        Order order = new Order();

        order.setPaymentMethod(new CashPayment());
        order.checkout(370.0);

        order.setPaymentMethod(new CardPayment());
        order.checkout(521.0);

        order.setPaymentMethod(new MobilePayment("+7 999 123-45-67"));
        order.checkout(250.5);
    }
}