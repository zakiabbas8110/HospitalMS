<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.abbas.HospitalMS.Model.Patient" %>

<!DOCTYPE html>
<html>
<head>
    <title>Patient Details</title>
</head>
<body>

<h1>Patient Details</h1>

<%
    Patient patient = (Patient) request.getAttribute("patient");

    if (patient != null) {
%>

    <p><b>Patient ID:</b> <%= patient.getPatientId() %></p>
    <p><b>Patient Name:</b> <%= patient.getPatientName() %></p>
    <p><b>Age:</b> <%= patient.getAge() %></p>
    <p><b>Gender:</b> <%= patient.getGender() %></p>
    <p><b>Phone Number:</b> <%= patient.getPhoneNumber() %></p>

<%
    } else {
%>

    <p>Patient not found!</p>

<%
    }
%>

</body>
</html>