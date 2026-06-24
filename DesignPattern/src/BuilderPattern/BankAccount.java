package BuilderPattern;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private boolean wantsAtmCard;


    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.ownerName = builder.ownerName;
        this.balance = builder.balance;
        this.wantsAtmCard = builder.wantsAtmCard;
    }


    public static class Builder {
        private String accountNumber;
        private String ownerName;
        private double balance;
        private boolean wantsAtmCard;

        public Builder(String accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
        }



        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }


        public Builder setWantsAtmCard(boolean wantsAtmCard) {
            this.wantsAtmCard = wantsAtmCard;
            return this;
        }

        // 3. Write the build() method

        public BankAccount build() {
            return new BankAccount(this);
        }

    }
}