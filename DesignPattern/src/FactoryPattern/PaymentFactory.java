package FactoryPattern;

public class PaymentFactory {

    public static PaymentProccessor getProcessor(String type){
        if(type.equals("CreditCard")){
            return new CreditCardProcessor();
        }
        if(type.equals("upi")){
            return new UpiProcessor();
        }
        else {
            return new PaypalProccessor();
        }
    }
}
