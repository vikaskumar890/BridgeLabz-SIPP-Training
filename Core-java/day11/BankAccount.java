public class BankAccount {

    private String accountHolderName;
    private final String accountNumber;
    private double balance;
    private static String bankName = "SBI Bank";
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts Opened: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul Sharma", "SB12345", 25000);
        BankAccount acc2 = new BankAccount("Priya Mehta", "SB67890", 40000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
