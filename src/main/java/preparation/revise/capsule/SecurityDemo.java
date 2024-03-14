package preparation.revise.capsule;

public class SecurityDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withDraw(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(200);
        System.out.println(bankAccount.getBalance());
    }
    static class BankAccount {

        private double balance;

        public void setBalance(double balance){
            this.balance = balance;
        }

        public double getBalance(){
            return balance;
        }

        public void withDraw(double amount){
            balance = balance - amount;
        }

        public void deposit(double amount){
            balance = balance + amount;
        }
    }
}
