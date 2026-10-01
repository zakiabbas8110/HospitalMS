package com.abbas.HospitalMS.Controller;

import java.util.Scanner;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Model.Patient;
import com.abbas.HospitalMS.Service.HospitalService;

public class HospitalController {

    public void start() {

        Scanner sc = new Scanner(System.in);

        HospitalService service = new HospitalService();

        while (true) {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Doctor");
            System.out.println("2. Find Doctor");
            System.out.println("3. Update Doctor");
            System.out.println("4. Delete Doctor");

            System.out.println("5. Add Patient");
            System.out.println("6. Find Patient");
            System.out.println("7. Update Patient");
            System.out.println("8. Delete Patient");

            System.out.println("9. Find Doctor by Name");
            System.out.println("10. Find Patient by Name");
            System.out.println("11. Find Doctor by Specialization");
            System.out.println("12. Display All Doctors");
            System.out.println("13. Display All Patients");
            System.out.println("14. Assign Doctor to Patient");
            System.out.println("15. Display Patients of a Doctor");
            System.out.println("16. Exit");
            
            

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                Doctor doctor = new Doctor();

                System.out.print("Enter Doctor Name: ");
                doctor.setDoctorName(sc.next());

                System.out.print("Enter Specialization: ");
                doctor.setSpecialization(sc.next());

                System.out.print("Enter Phone Number: ");
                doctor.setPhoneNumber(sc.next());

                service.addDoctor(doctor);

                break;


            case 2:

                System.out.print("Enter Doctor ID: ");
                int doctorId = sc.nextInt();

                Doctor d = service.findDoctor(doctorId);

                if (d != null) {

                    System.out.println("Doctor ID: " + d.getDoctorId());
                    System.out.println("Doctor Name: " + d.getDoctorName());
                    System.out.println("Specialization: " + d.getSpecialization());
                    System.out.println("Phone Number: " + d.getPhoneNumber());

                } else {

                    System.out.println("Doctor not found!");
                }

                break;


            case 3:

                System.out.print("Enter Doctor ID: ");
                int updateId = sc.nextInt();

                Doctor updateDoctor = service.findDoctor(updateId);

                if (updateDoctor != null) {

                    System.out.print("Enter New Doctor Name: ");
                    updateDoctor.setDoctorName(sc.next());

                    System.out.print("Enter New Specialization: ");
                    updateDoctor.setSpecialization(sc.next());

                    System.out.print("Enter New Phone Number: ");
                    updateDoctor.setPhoneNumber(sc.next());

                    service.updateDoctor(updateDoctor);

                } else {

                    System.out.println("Doctor not found!");
                }

                break;


            case 4:

                System.out.print("Enter Doctor ID: ");
                int deleteId = sc.nextInt();

                service.deleteDoctor(deleteId);

                break;


            case 5:

                Patient patient = new Patient();

                System.out.print("Enter Patient Name: ");
                patient.setPatientName(sc.next());

                System.out.print("Enter Age: ");
                patient.setAge(sc.nextInt());

                System.out.print("Enter Gender: ");
                patient.setGender(sc.next());

                System.out.print("Enter Phone Number: ");
                patient.setPhoneNumber(sc.next());

                service.addPatient(patient);

                break;


            case 6:

                System.out.print("Enter Patient ID: ");
                int patientId = sc.nextInt();

                Patient p = service.findPatient(patientId);

                if (p != null) {

                    System.out.println("Patient ID: " + p.getPatientId());
                    System.out.println("Patient Name: " + p.getPatientName());
                    System.out.println("Age: " + p.getAge());
                    System.out.println("Gender: " + p.getGender());
                    System.out.println("Phone Number: " + p.getPhoneNumber());

                } else {

                    System.out.println("Patient not found!");
                }

                break;


            case 7:

                System.out.print("Enter Patient ID: ");
                int updatePatientId = sc.nextInt();

                Patient updatePatient =
                        service.findPatient(updatePatientId);

                if (updatePatient != null) {

                    System.out.print("Enter New Patient Name: ");
                    updatePatient.setPatientName(sc.next());

                    System.out.print("Enter New Age: ");
                    updatePatient.setAge(sc.nextInt());

                    System.out.print("Enter New Gender: ");
                    updatePatient.setGender(sc.next());

                    System.out.print("Enter New Phone Number: ");
                    updatePatient.setPhoneNumber(sc.next());

                    service.updatePatient(updatePatient);

                } else {

                    System.out.println("Patient not found!");
                }

                break;


            case 8:

                System.out.print("Enter Patient ID: ");
                int deletePatientId = sc.nextInt();

                service.deletePatient(deletePatientId);

                break;
                
            case 9:

                System.out.print("Enter Doctor Name: ");
                String doctorName = sc.next();

                service.findDoctorByName(doctorName);

                break;


            case 10:

                System.out.print("Enter Patient Name: ");
                String patientName = sc.next();

                service.findPatientByName(patientName);

                break;


            case 11:

                System.out.print("Enter Specialization: ");
                String specialization = sc.next();

                service.findDoctorBySpecialization(specialization);

                break;


            case 12:

                service.displayAllDoctors();

                break;


            case 13:

                service.displayAllPatients();

                break;

            case 14:

                System.out.print("Enter Patient ID: ");
                int assignPatientId = sc.nextInt();

                System.out.print("Enter Doctor ID: ");
                int assignDoctorId = sc.nextInt();

                service.assignDoctorToPatient(assignPatientId, assignDoctorId);

                break;
                
            case 15:

                System.out.print("Enter Doctor ID: ");
                int displayDoctorId = sc.nextInt();

                service.displayPatientsOfDoctor(displayDoctorId);

                break;

            case 16:

                service.close();

                System.out.println("Thank you!");

                sc.close();

                return;



            default:

                System.out.println("Invalid choice!");
            }
        }
    }
}