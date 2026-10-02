<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Patients of Doctor</title>
</head>
<body>

<h1>Display Patients of Doctor</h1>

<form action="displayPatientsOfDoctor" method="get">

    Doctor ID:
    <input type="number" name="doctorId" required>

    <input type="submit" value="Display Patients">

</form>

</body>
</html>