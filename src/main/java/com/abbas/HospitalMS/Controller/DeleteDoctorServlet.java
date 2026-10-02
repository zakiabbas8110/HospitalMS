package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/deleteDoctor")
public class DeleteDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int doctorId = Integer.parseInt(request.getParameter("doctorId"));

        HospitalService service = new HospitalService();

        service.deleteDoctor(doctorId);

        service.close();

        response.getWriter().println("Doctor deleted successfully!");
    }
}