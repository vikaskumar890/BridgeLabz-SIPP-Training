public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Vikas Kumar", "123456789", 50000);

        System.out.println("=== Initial Account Details ===");
        account.displayBalance();

        System.out.println("\n=== Deposit Operation ===");
        account.deposit(10000);
        account.displayBalance();

        System.out.println("\n=== Withdraw Operation ===");
        account.withdraw(20000);
        account.displayBalance();

        System.out.println("\n=== Withdraw Operation with Insufficient Balance ===");
        account.withdraw(50000);
    }
}
