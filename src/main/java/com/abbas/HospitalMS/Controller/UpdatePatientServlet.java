package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Patient;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/updatePatient")
public class UpdatePatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int patientId = Integer.parseInt(request.getParameter("patientId"));
        String patientName = request.getParameter("patientName");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String phoneNumber = request.getParameter("phoneNumber");

        Patient patient = new Patient();

        patient.setPatientId(patientId);
        patient.setPatientName(patientName);
        patient.setAge(age);
        patient.setGender(gender);
        patient.setPhoneNumber(phoneNumber);

        HospitalService service = new HospitalService();

        service.updatePatient(patient);

        service.close();

        response.getWriter().println("Patient updated successfully!");
    }
}