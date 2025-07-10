package aston.hometask.ChainOfResponsibility;

public class CoffeeVendingMachine {
    public static void main(String[] args) {
        CoffeePaymentHandler handler = new FiveHundredRublesHandler();
        CoffeePaymentHandler handler2 = new HundredRublesHandler();
        CoffeePaymentHandler handler3 = new FiftyRublesHandler();

        handler.setNext(handler2);
        handler2.setNext(handler3);

        System.out.println("Оплата 650 руб:");
        handler.handlePayment(650);

        System.out.println("\nОплата 250 руб:");
        handler.handlePayment(250);

        System.out.println("\nОплата 175 руб:");
        handler.handlePayment(175);
    }
}
