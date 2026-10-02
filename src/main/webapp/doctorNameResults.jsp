<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.abbas.HospitalMS.Model.Doctor" %>

<!DOCTYPE html>
<html>
<head>
    <title>Doctor Search Results</title>
</head>
<body>

<h1>Doctor Search Results</h1>

<%
    List<Doctor> doctors = (List<Doctor>) request.getAttribute("doctors");

    if (doctors == null || doctors.isEmpty()) {
%>

    <p>Doctor not found!</p>

<%
    } else {
%>

<table border="1">

    <tr>
        <th>Doctor ID</th>
        <th>Doctor Name</th>
        <th>Specialization</th>
        <th>Phone Number</th>
    </tr>

<%
        for (Doctor d : doctors) {
%>

    <tr>
        <td><%= d.getDoctorId() %></td>
        <td><%= d.getDoctorName() %></td>
        <td><%= d.getSpecialization() %></td>
        <td><%= d.getPhoneNumber() %></td>
    </tr>

<%
        }
%>

</table>

<%
    }
%>

</body>
</html>