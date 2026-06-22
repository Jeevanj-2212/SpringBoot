package singlton;

public class TradingPlatformConfig {
    private static TradingPlatformConfig instance;


    private TradingPlatformConfig() {
        System.out.println("Pinocode is 1234");
    }
    public static TradingPlatformConfig getInstance() {
        if(instance == null) {
            instance = new TradingPlatformConfig();
        }
        return instance;
    }
}
