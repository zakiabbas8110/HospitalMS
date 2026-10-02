package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/assignDoctorToPatient")
public class AssignDoctorToPatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int patientId = Integer.parseInt(request.getParameter("patientId"));
        int doctorId = Integer.parseInt(request.getParameter("doctorId"));

        HospitalService service = new HospitalService();

        service.assignDoctorToPatient(patientId, doctorId);

        service.close();

        response.getWriter().println("Doctor assigned to patient successfully!");
    }
}