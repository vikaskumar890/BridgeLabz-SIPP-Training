package OOPS.Day2;
import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<BankAccount> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(BankAccount account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (BankAccount acc : accounts) {
            System.out.println("Bank: " + acc.bank.getName() + ", Balance: " + acc.balance);
        }
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    BankAccount openAccount(Customer customer, double initialBalance) {
        BankAccount account = new BankAccount(this, initialBalance);
        customer.addAccount(account);
        return account;
    }
}

class BankAccount {
    Bank bank;
    double balance;

    BankAccount(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer customer1 = new Customer("Amit");
        Customer customer2 = new Customer("Riya");

        sbi.openAccount(customer1, 5000);
        hdfc.openAccount(customer1, 10000);
        sbi.openAccount(customer2, 7000);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
