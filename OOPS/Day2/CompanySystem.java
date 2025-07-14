package OOPS.Day2;
import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department devDept = new Department("Development");
        devDept.addEmployee("Alice");
        devDept.addEmployee("Bob");

        Department hrDept = new Department("HR");
        hrDept.addEmployee("Charlie");

        company.addDepartment(devDept);
        company.addDepartment(hrDept);

        company.displayCompany();
    }
}
