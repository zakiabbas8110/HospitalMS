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

@WebServlet("/doctor")
public class DoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String doctorName = request.getParameter("doctorName");
        String specialization = request.getParameter("specialization");
        String phoneNumber = request.getParameter("phoneNumber");

        Doctor doctor = new Doctor();

        doctor.setDoctorName(doctorName);
        doctor.setSpecialization(specialization);
        doctor.setPhoneNumber(phoneNumber);

        HospitalService service = new HospitalService();

        service.addDoctor(doctor);

        service.close();

        response.getWriter().println("Doctor added successfully!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HospitalService service = new HospitalService();

        List<Doctor> doctors = service.displayAllDoctors();

        service.close();

        request.setAttribute("doctors", doctors);

        request.getRequestDispatcher("doctors.jsp").forward(request, response);
    }
}