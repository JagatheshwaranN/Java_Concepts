package preparation.revise_1.capsule;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder("123456789").balance(100.0).build();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
    }

    static class BankAccount {

        private String accountNumber;
        private double balance;

        public BankAccount(Builder builder){
            this.accountNumber = builder.accountNumber;
            this.balance = builder.balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public static class Builder {
            private String accountNumber;
            private double balance;

            public Builder(String accountNumber){
                this.accountNumber = accountNumber;
            }

            public Builder balance(double balance){
                this.balance = balance;
                return this;
            }

            public BankAccount build(){
                return new BankAccount(this);
            }
        }

    }
}
