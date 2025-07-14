package OOPS.Day2;
import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
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

    void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students;

    School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            s.showCourses();
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Ananya");
        Student s2 = new Student("Rohit");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showAllStudents();
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
