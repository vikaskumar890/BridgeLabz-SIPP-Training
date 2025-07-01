public class Student {

    private String name;
    private final int rollNumber;
    private String grade;
    private static String universityName = "National University";
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kavya Sharma", 1101, "A");
        Student s2 = new Student("Rohit Verma", 1102, "B");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();
    }
}
