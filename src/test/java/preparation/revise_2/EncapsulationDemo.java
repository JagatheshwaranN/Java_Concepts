package preparation.revise_2;

public class EncapsulationDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // System.out.println(account.balance); // 'balance' has private access in 'revise.BankAccount'
        System.out.println(account.getBalance());
        account.setBalance(100.00);
        System.out.println(account.getBalance());
    }
}

class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

}
