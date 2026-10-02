<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.abbas.HospitalMS.Model.Doctor" %>

<!DOCTYPE html>
<html>
<head>
    <title>Doctor Details</title>
</head>
<body>

<h1>Doctor Details</h1>

<%
    Doctor doctor = (Doctor) request.getAttribute("doctor");

    if (doctor != null) {
%>

    <p><b>Doctor ID:</b> <%= doctor.getDoctorId() %></p>
    <p><b>Doctor Name:</b> <%= doctor.getDoctorName() %></p>
    <p><b>Specialization:</b> <%= doctor.getSpecialization() %></p>
    <p><b>Phone Number:</b> <%= doctor.getPhoneNumber() %></p>

<%
    } else {
%>

    <p>Doctor not found!</p>

<%
    }
%>

</body>
</html>