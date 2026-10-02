<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Assign Doctor To Patient</title>
</head>
<body>

<h1>Assign Doctor To Patient</h1>

<form action="assignDoctorToPatient" method="post">

    Patient ID:
    <input type="number" name="patientId" required>
    <br><br>

    Doctor ID:
    <input type="number" name="doctorId" required>
    <br><br>

    <input type="submit" value="Assign Doctor">

</form>

</body>
</html>