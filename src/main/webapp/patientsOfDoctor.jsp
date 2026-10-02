<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.abbas.HospitalMS.Model.Doctor" %>
<%@ page import="com.abbas.HospitalMS.Model.Patient" %>

<!DOCTYPE html>
<html>
<head>
    <title>Patients of Doctor</title>
</head>
<body>

<h1>Patients of Doctor</h1>

<%
    Doctor doctor = (Doctor) request.getAttribute("doctor");

    if (doctor == null) {
%>

    <p>Doctor not found!</p>

<%
    } else {
%>

    <p><b>Doctor ID:</b> <%= doctor.getDoctorId() %></p>
    <p><b>Doctor Name:</b> <%= doctor.getDoctorName() %></p>
    <p><b>Specialization:</b> <%= doctor.getSpecialization() %></p>

    <h2>Patients</h2>

<%
List<Patient> patients = (List<Patient>) request.getAttribute("patients");

    if (patients == null || patients.isEmpty()) {
%>

    <p>No patients assigned to this doctor!</p>

<%
    } else {
%>

    <table border="1">

        <tr>
            <th>Patient ID</th>
            <th>Patient Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Phone Number</th>
        </tr>

<%
        for (Patient p : patients) {
%>

        <tr>
            <td><%= p.getPatientId() %></td>
            <td><%= p.getPatientName() %></td>
            <td><%= p.getAge() %></td>
            <td><%= p.getGender() %></td>
            <td><%= p.getPhoneNumber() %></td>
        </tr>

<%
        }
%>

    </table>

<%
    }
}
%>

</body>
</html>