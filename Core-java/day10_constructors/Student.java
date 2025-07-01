public class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("PG Student Name (Accessed Protected): " + name);
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Anjali", 8.6, "Data Science");

        System.out.println("=== Student Details ===");
        pg.displayDetails();

        System.out.println("\n=== PG Student Additional Info ===");
        pg.displayPGDetails();

        System.out.println("\nUpdating CGPA...");
        pg.setCgpa(9.2);
        pg.displayDetails();
    }
}
