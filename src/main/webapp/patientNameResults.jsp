<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.abbas.HospitalMS.Model.Patient" %>

<!DOCTYPE html>
<html>
<head>
    <title>Patient Search Results</title>
</head>
<body>

<h1>Patient Search Results</h1>

<%
    List<Patient> patients = (List<Patient>) request.getAttribute("patients");

    if (patients == null || patients.isEmpty()) {
%>

    <p>Patient not found!</p>

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
%>

</body>
</html>