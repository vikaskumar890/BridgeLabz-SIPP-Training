public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {

    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerInfo() {
        System.out.println("Manager ID (Public): " + employeeID);
        System.out.println("Department (Protected): " + department);
        System.out.println("Team: " + team);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(2001, "IT", 90000, "Development");

        System.out.println("=== Employee Details ===");
        mgr.displayEmployeeDetails();

        System.out.println("\n=== Manager Info ===");
        mgr.displayManagerInfo();

        System.out.println("\nUpdating Salary...");
        mgr.setSalary(100000);
        mgr.displayEmployeeDetails();
    }
}
