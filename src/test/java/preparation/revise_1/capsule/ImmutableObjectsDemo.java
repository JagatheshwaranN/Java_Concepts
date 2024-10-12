package preparation.revise_1.capsule;

public class ImmutableObjectsDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 150.0);
        System.out.println(account.accountNumber());
        System.out.println(account.balance());
        BankAccount1 account1 = new BankAccount1("123456789", 150.0);
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
    }

    record BankAccount(String accountNumber, double balance) {

    }

    static class BankAccount1 {
        private final String accountNumber;
        private final double balance;

        BankAccount1(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }
    }

}
