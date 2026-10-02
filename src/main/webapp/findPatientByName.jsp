<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Find Patient By Name</title>
</head>
<body>

<h1>Find Patient By Name</h1>

<form action="findPatientByName" method="get">

    Patient Name:
    <input type="text" name="patientName" required>

    <input type="submit" value="Find Patient">

</form>

</body>
</html>