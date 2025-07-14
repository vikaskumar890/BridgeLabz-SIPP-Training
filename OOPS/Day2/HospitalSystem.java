package OOPS.Day2;
import java.util.ArrayList;

class Doctor {
    String name;
    ArrayList<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient patient) {
        patients.add(patient);
        patient.doctors.add(this);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.name);
    }

    void showPatients() {
        System.out.println("Doctor: " + name);
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Patient {
    String name;
    ArrayList<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void showDoctors() {
        System.out.println("Patient: " + name);
        for (Doctor d : doctors) {
            System.out.println("- " + d.name);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showAll() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            d.showPatients();
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            p.showDoctors();
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Meera");
        Doctor d2 = new Doctor("Dr. Ramesh");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Sara");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        h.showAll();
    }
}

