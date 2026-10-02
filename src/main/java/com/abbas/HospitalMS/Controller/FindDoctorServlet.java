package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/findDoctor")
public class FindDoctorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int doctorId = Integer.parseInt(request.getParameter("doctorId"));

        HospitalService service = new HospitalService();

        Doctor doctor = service.findDoctor(doctorId);

        service.close();

        request.setAttribute("doctor", doctor);

        request.getRequestDispatcher("doctorDetails.jsp").forward(request, response);
    }
}