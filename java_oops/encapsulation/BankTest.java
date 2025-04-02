package encapsulation;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: " + amount);
        } else {
            System.out.println("deposit amount must be positive");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Insufficient funds.");
        }
    }
}
public class BankTest {
   public static void main(String[] args) {
    BankAccount account = new BankAccount(1000);
    account.deposit(500);
    System.out.println("current Balance: " + account.getBalance());
    account.withdraw(300);
    System.out.println("current Balance: " + account.getBalance());
    account.withdraw(2000);
   }
}
