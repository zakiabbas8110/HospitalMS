package com.abbas.HospitalMS.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Patient;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/findPatientByName")
public class FindPatientByNameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String patientName = request.getParameter("patientName");

        HospitalService service = new HospitalService();

        List<Patient> patients = service.findPatientByName(patientName);

        service.close();

        request.setAttribute("patients", patients);

        request.getRequestDispatcher("patientNameResults.jsp").forward(request, response);
    }
}