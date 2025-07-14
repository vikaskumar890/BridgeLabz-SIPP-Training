package OOPS.Day2;
import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void displayDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University uni = new University("Sunrise University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Neha");
        Faculty f2 = new Faculty("Dr. Arjun");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayDetails();
    }
}

