package com.abbas.HospitalMS.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Model.Patient;

public class HospitalService {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("app");

    EntityManager em = emf.createEntityManager();


    // ================= DOCTOR =================

    // Add Doctor
    public void addDoctor(Doctor doctor) {

        em.getTransaction().begin();

        em.persist(doctor);

        em.getTransaction().commit();

        System.out.println("Doctor added successfully!");
    }


    // Find Doctor
    public Doctor findDoctor(int doctorId) {

        Doctor doctor = em.find(Doctor.class, doctorId);

        return doctor;
    }


    // Update Doctor
    public void updateDoctor(Doctor doctor) {

        em.getTransaction().begin();

        em.merge(doctor);

        em.getTransaction().commit();

        System.out.println("Doctor updated successfully!");
    }


    // Delete Doctor
    public void deleteDoctor(int doctorId) {

        em.getTransaction().begin();

        Doctor doctor = em.find(Doctor.class, doctorId);

        if (doctor != null) {

            em.remove(doctor);

            System.out.println("Doctor deleted successfully!");

        } else {

            System.out.println("Doctor not found!");
        }

        em.getTransaction().commit();
    }


    // ================= PATIENT =================

    // Add Patient
    public void addPatient(Patient patient) {

        em.getTransaction().begin();

        em.persist(patient);

        em.getTransaction().commit();

        System.out.println("Patient added successfully!");
    }


    // Find Patient
    public Patient findPatient(int patientId) {

        Patient patient = em.find(Patient.class, patientId);

        return patient;
    }


    // Update Patient
    public void updatePatient(Patient patient) {

        em.getTransaction().begin();

        em.merge(patient);

        em.getTransaction().commit();

        System.out.println("Patient updated successfully!");
    }


    // Delete Patient
    public void deletePatient(int patientId) {

        em.getTransaction().begin();

        Patient patient = em.find(Patient.class, patientId);

        if (patient != null) {

            em.remove(patient);

            System.out.println("Patient deleted successfully!");

        } else {

            System.out.println("Patient not found!");
        }

        em.getTransaction().commit();
    }

    
    public void findDoctorByName(String doctorName) {

        List<Doctor> doctors = em.createQuery(
                "SELECT d FROM Doctor d WHERE d.doctorName = :name",
                Doctor.class)
                .setParameter("name", doctorName)
                .getResultList();

        if (doctors.isEmpty()) {

            System.out.println("Doctor not found!");

        } else {

            for (Doctor d : doctors) {

                System.out.println("Doctor ID: " + d.getDoctorId());
                System.out.println("Doctor Name: " + d.getDoctorName());
                System.out.println("Specialization: " + d.getSpecialization());
                System.out.println("Phone Number: " + d.getPhoneNumber());
            }
        }
    }
    
    public void findPatientByName(String patientName) {

        List<Patient> patients = em.createQuery(
                "SELECT p FROM Patient p WHERE p.patientName = :name",
                Patient.class)
                .setParameter("name", patientName)
                .getResultList();

        if (patients.isEmpty()) {

            System.out.println("Patient not found!");

        } else {

            for (Patient p : patients) {

                System.out.println("Patient ID: " + p.getPatientId());
                System.out.println("Patient Name: " + p.getPatientName());
                System.out.println("Age: " + p.getAge());
                System.out.println("Gender: " + p.getGender());
                System.out.println("Phone Number: " + p.getPhoneNumber());
            }
        }
    }
    
    public void findDoctorBySpecialization(String specialization) {

        List<Doctor> doctors = em.createQuery(
                "SELECT d FROM Doctor d WHERE d.specialization = :specialization",
                Doctor.class)
                .setParameter("specialization", specialization)
                .getResultList();

        if (doctors.isEmpty()) {

            System.out.println("Doctor not found!");

        } else {

            for (Doctor d : doctors) {

                System.out.println("Doctor ID: " + d.getDoctorId());
                System.out.println("Doctor Name: " + d.getDoctorName());
                System.out.println("Specialization: " + d.getSpecialization());
                System.out.println("Phone Number: " + d.getPhoneNumber());
            }
        }
    }
    
    public void displayAllDoctors() {

        List<Doctor> doctors = em.createQuery(
                "SELECT d FROM Doctor d",
                Doctor.class)
                .getResultList();

        for (Doctor d : doctors) {

            System.out.println("----------------------");
            System.out.println("Doctor ID: " + d.getDoctorId());
            System.out.println("Doctor Name: " + d.getDoctorName());
            System.out.println("Specialization: " + d.getSpecialization());
            System.out.println("Phone Number: " + d.getPhoneNumber());
        }
    }
    
    public void displayAllPatients() {

        List<Patient> patients = em.createQuery(
                "SELECT p FROM Patient p",
                Patient.class)
                .getResultList();

        for (Patient p : patients) {

            System.out.println("----------------------");
            System.out.println("Patient ID: " + p.getPatientId());
            System.out.println("Patient Name: " + p.getPatientName());
            System.out.println("Age: " + p.getAge());
            System.out.println("Gender: " + p.getGender());
            System.out.println("Phone Number: " + p.getPhoneNumber());
        }
    }
    
    public void assignDoctorToPatient(int patientId, int doctorId) {

        Patient patient = em.find(Patient.class, patientId);
        Doctor doctor = em.find(Doctor.class, doctorId);

        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }

        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        em.getTransaction().begin();

        patient.setDoctor(doctor);

        em.getTransaction().commit();

        System.out.println("Doctor assigned to patient successfully!");
    }
    
    public void displayPatientsOfDoctor(int doctorId) {

        Doctor doctor = em.find(Doctor.class, doctorId);

        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        System.out.println("Doctor ID: " + doctor.getDoctorId());
        System.out.println("Doctor Name: " + doctor.getDoctorName());
        System.out.println("Specialization: " + doctor.getSpecialization());

        System.out.println("Patients:");

        List<Patient> patients = doctor.getPatients();

        if (patients == null || patients.isEmpty()) {
            System.out.println("No patients assigned to this doctor!");
        } else {

            for (Patient p : patients) {

                System.out.println("----------------------");
                System.out.println("Patient ID: " + p.getPatientId());
                System.out.println("Patient Name: " + p.getPatientName());
                System.out.println("Age: " + p.getAge());
                System.out.println("Gender: " + p.getGender());
                System.out.println("Phone Number: " + p.getPhoneNumber());
            }
        }
    }
    
    

    // Close
    public void close() {

        em.close();
        emf.close();

        System.out.println("EntityManager closed!");
    }
}