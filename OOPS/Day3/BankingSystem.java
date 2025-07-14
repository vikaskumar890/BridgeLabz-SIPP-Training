package OOPS.Day3;
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public double calculateInterest() {
        return 0;
    }

    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    public double calculateLoanEligibility() {
        return getBalance() * 1.5;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("SB1001", "Riya", 50000);
        BankAccount a2 = new CurrentAccount("CA2002", "Kabir", 120000);

        BankAccount[] accounts = { a1, a2 };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: ₹" + acc.calculateInterest());

            Loanable loanAcc = (Loanable) acc;
            double requestedLoan = 60000;
            System.out.println("Loan Approved? " + loanAcc.applyForLoan(requestedLoan));
            System.out.println("Max Eligible Loan: ₹" + loanAcc.calculateLoanEligibility());
            System.out.println("-------------------------");
        }
    }
}

