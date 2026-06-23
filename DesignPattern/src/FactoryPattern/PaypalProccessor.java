package FactoryPattern;

public class PaypalProccessor implements PaymentProccessor{

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " Transferred from Paypal");
    }
}
