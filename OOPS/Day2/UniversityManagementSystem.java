package OOPS.Day2;
import java.util.ArrayList;

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.assignCourse(this);
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollCourse(this);
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class Professor {
    String name;
    ArrayList<Course> courses;

    Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    void viewAssignedCourses() {
        System.out.println("Professor: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Nikhil");
        Professor prof2 = new Professor("Dr. Sneha");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        Student s1 = new Student("Meena");
        Student s2 = new Student("Tarun");

        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        c1.showDetails();
        c2.showDetails();

        s1.viewCourses();
        prof1.viewAssignedCourses();
    }
}

