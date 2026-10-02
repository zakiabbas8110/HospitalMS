package com.abbas.HospitalMS.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/updateDoctor")
public class UpdateDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int doctorId = Integer.parseInt(request.getParameter("doctorId"));

        String doctorName = request.getParameter("doctorName");
        String specialization = request.getParameter("specialization");
        String phoneNumber = request.getParameter("phoneNumber");

        Doctor doctor = new Doctor();

        doctor.setDoctorId(doctorId);
        doctor.setDoctorName(doctorName);
        doctor.setSpecialization(specialization);
        doctor.setPhoneNumber(phoneNumber);

        HospitalService service = new HospitalService();

        service.updateDoctor(doctor);

        service.close();

        response.getWriter().println("Doctor updated successfully!");
    }
}