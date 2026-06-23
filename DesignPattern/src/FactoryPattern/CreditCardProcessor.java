package FactoryPattern;

public class CreditCardProcessor implements PaymentProccessor{


    public CreditCardProcessor() {

    }

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " Transferred from Credit card");
    }
}
