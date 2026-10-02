package com.abbas.HospitalMS;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abbas.HospitalMS.Model.Doctor;
import com.abbas.HospitalMS.Service.HospitalService;

@WebServlet("/findDoctorByName")
public class FindDoctorByNameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String doctorName = request.getParameter("doctorName");

        HospitalService service = new HospitalService();

        List<Doctor> doctors = service.findDoctorByName(doctorName);

        service.close();

        request.setAttribute("doctors", doctors);

        request.getRequestDispatcher("doctorNameResults.jsp").forward(request, response);
    }
}