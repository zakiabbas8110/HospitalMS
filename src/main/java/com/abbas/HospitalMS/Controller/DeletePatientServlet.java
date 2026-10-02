package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/deletePatient")
public class DeletePatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int patientId = Integer.parseInt(request.getParameter("patientId"));

        HospitalService service = new HospitalService();

        service.deletePatient(patientId);

        service.close();

        response.getWriter().println("Patient deleted successfully!");
    }
}