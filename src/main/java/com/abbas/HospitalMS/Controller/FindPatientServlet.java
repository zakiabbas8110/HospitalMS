package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Patient;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/findPatient")
public class FindPatientServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int patientId = Integer.parseInt(request.getParameter("patientId"));

        HospitalService service = new HospitalService();

        Patient patient = service.findPatient(patientId);

        service.close();

        request.setAttribute("patient", patient);

        request.getRequestDispatcher("patientDetails.jsp").forward(request, response);
    }
}