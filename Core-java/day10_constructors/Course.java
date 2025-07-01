public class Course {

    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Full Stack", 12, 15000);
        Course course2 = new Course("Python for Data Science", 10, 18000);

        System.out.println("=== Course 1 ===");
        course1.displayCourseDetails();

        System.out.println("\n=== Course 2 ===");
        course2.displayCourseDetails();

        Course.updateInstituteName("XYZ Tech Academy");

        System.out.println("\n=== After Institute Name Update ===");
        course1.displayCourseDetails();
    }
}
