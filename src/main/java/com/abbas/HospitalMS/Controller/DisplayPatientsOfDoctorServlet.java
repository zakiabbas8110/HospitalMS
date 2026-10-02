package com.abbas.HospitalMS.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Model.Patient;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/displayPatientsOfDoctor")
public class DisplayPatientsOfDoctorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int doctorId = Integer.parseInt(request.getParameter("doctorId"));

        HospitalService service = new HospitalService();

        Doctor doctor = service.findDoctor(doctorId);

        List<Patient> patients = null;

        if (doctor != null) {
            patients = doctor.getPatients();

            // Load patients while EntityManager is still open
            patients.size();
        }

        service.close();

        request.setAttribute("doctor", doctor);
        request.setAttribute("patients", patients);

        request.getRequestDispatcher("patientsOfDoctor.jsp").forward(request, response);
    }
}