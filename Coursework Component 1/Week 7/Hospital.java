package Java_Coursework;

//Base class
class HospitalEmployee {
 protected String name;
 protected int employeeNumber;

 public HospitalEmployee(String name, int employeeNumber) {
     this.name = name;
     this.employeeNumber = employeeNumber;
 }
}

//Doctor class
class Doctor extends HospitalEmployee {
 public Doctor(String name, int employeeNumber) {
     super(name, employeeNumber);
 }

 public void treatPatient() {
     System.out.println("Doctor " + employeeNumber + " specializes in treating patients.");
 }
}

//Nurse class
class Nurse extends HospitalEmployee {
 public Nurse(String name, int employeeNumber) {
     super(name, employeeNumber);
 }

 public void assistPatients() {
     System.out.println("Nurse " + employeeNumber + " has patients to assist.");
 }
}

//Receptionist class
class Receptionist extends HospitalEmployee {
 public Receptionist(String name, int employeeNumber) {
     super(name, employeeNumber);
 }

 public void takeCalls() {
     System.out.println("Receptionist " + employeeNumber + " is answering phone calls.");
 }
}

//Cleaner class
class Cleaner extends HospitalEmployee {
 public Cleaner(String name, int employeeNumber) {
     super(name, employeeNumber);
 }

 public void cleanHospital() {
     System.out.println("Cleaner " + employeeNumber + " is sweeping the hospital.");
 }
}

//Driver class
public class Hospital {
 public static void main(String[] args) {
     // Create objects
     Doctor doctor = new Doctor("Dr. Sharma", 11);
     Nurse nurse = new Nurse("Nurse Pooja", 22);
     Receptionist receptionist = new Receptionist("Receptionist Ram", 33);
     Cleaner cleaner = new Cleaner("Cleaner Sita", 44);

     // Test each method
     doctor.treatPatient();
     nurse.assistPatients();
     receptionist.takeCalls();
     cleaner.cleanHospital();
 }
}
