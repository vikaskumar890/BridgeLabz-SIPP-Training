public class Employee {

    private String name;
    private final int id;
    private String designation;
    private static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Arjun Mehta", 101, "Software Engineer");
        Employee e2 = new Employee("Sneha Jain", 102, "QA Analyst");

        e1.displayEmployeeDetails();
        System.out.println();
        e2.displayEmployeeDetails();
        System.out.println();
        Employee.displayTotalEmployees();
    }
}
