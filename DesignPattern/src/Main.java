import BuilderPattern.BankAccount;
import FactoryPattern.PaymentFactory;
import FactoryPattern.PaymentProccessor;
import singlton.TradingPlatformConfig;

public class Main {
    public static void main(String[] args) {
      TradingPlatformConfig config = TradingPlatformConfig.getInstance();
        TradingPlatformConfig config1 = TradingPlatformConfig.getInstance();

        System.out.println("=========== Factory Pattern ===================");
         PaymentProccessor paymentFactory = PaymentFactory.getProcessor("upi");
         paymentFactory.processPayment(10);

        System.out.println("=========== Builder Pattern ===========");


        BankAccount myAccount = new BankAccount.Builder("12345", "Jeevan")


                .setBalance(500.0)
                .setWantsAtmCard(true)


                .build();

        System.out.println("Bank Account created successfully!");


        BankAccount secondAccount = new BankAccount.Builder("98765", "Rahul")
                .setBalance(50.0)
                .build();

        System.out.println("Second Bank Account created successfully!");

    }
}