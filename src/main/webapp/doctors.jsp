<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.abbas.HospitalMS.Model.Doctor" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Doctors</title>
</head>
<body>

<h1>All Doctors</h1>

<table border="1">

    <tr>
        <th>Doctor ID</th>
        <th>Doctor Name</th>
        <th>Specialization</th>
        <th>Phone Number</th>
    </tr>

<%
    List<Doctor> doctors = (List<Doctor>) request.getAttribute("doctors");

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

</body>
</html>