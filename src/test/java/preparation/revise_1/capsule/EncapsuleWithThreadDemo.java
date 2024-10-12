package preparation.revise_1.capsule;

public class EncapsuleWithThreadDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0);
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bankAccount.deposit(100.0);
            }
        });
        Thread withDrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bankAccount.withdraw(50.0);
            }
        });

        depositThread.start();
        withDrawThread.start();

        try {
            depositThread.join();
            withDrawThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Balance Amount : " + bankAccount.getBalance());
    }

    public static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public synchronized void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit Amount : " + amount);
            }
        }

        public synchronized void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw Amount : " + amount);
            }
        }

        public double getBalance() {
            return balance;
        }
    }
}

