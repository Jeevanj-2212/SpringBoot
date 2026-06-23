package FactoryPattern;

public class UpiProcessor implements PaymentProccessor {


    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " Transferred from Upi ");
    }
}
