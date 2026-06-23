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
    }
}