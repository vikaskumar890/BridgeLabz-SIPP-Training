public class Student {

    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 35) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Vikas Kumar", 101, 85);
        Student student2 = new Student("Rahul Sharma", 102, 67);

        System.out.println("=== Student 1 ===");
        student1.displayDetails();

        System.out.println("\n=== Student 2 ===");
        student2.displayDetails();
    }
}
