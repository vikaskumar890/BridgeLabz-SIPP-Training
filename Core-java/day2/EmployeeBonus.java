import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("No bonus for less than 5 years of service.");
        }
    }
}
