package com.abbas.HospitalMS.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/findDoctorBySpecialization")
public class FindDoctorBySpecializationServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String specialization = request.getParameter("specialization");

        HospitalService service = new HospitalService();

        List<Doctor> doctors = service.findDoctorBySpecialization(specialization);

        service.close();

        request.setAttribute("doctors", doctors);

        request.getRequestDispatcher("specializationResults.jsp").forward(request, response);
    }
}