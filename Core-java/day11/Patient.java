public class Patient {

    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Ritika Sharma", 32, "Flu", 501);
        Patient p2 = new Patient("Amit Roy", 45, "Fracture", 502);

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();

        System.out.println();
        Patient.getTotalPatients();
    }
}
