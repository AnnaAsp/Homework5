package aston.hometask.Strategy;

public class MobilePayment implements PaymentMethod {
    private String phone;

    public MobilePayment(String phone) {
        this.phone = phone;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Оплачено с телефона %s: %.2f руб.\n", phone, amount);
    }
}
