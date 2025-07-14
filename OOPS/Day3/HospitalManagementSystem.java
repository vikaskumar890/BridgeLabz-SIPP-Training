package OOPS.Day3;
interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private String diagnosis;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Ananya", 32, 4, 1500);
        Patient p2 = new OutPatient("P002", "Rohan", 28, 500);

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            p.getPatientDetails();
            MedicalRecord record = (MedicalRecord) p;
            record.addRecord("General Checkup");
            record.viewRecords();
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println("------------------------");
        }
    }
}

