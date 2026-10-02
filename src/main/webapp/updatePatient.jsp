<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Patient</title>
</head>
<body>

<h1>Update Patient</h1>

<form action="updatePatient" method="post">

    Patient ID:
    <input type="number" name="patientId" required>
    <br><br>

    Patient Name:
    <input type="text" name="patientName" required>
    <br><br>

    Age:
    <input type="number" name="age" required>
    <br><br>

    Gender:
    <input type="text" name="gender" required>
    <br><br>

    Phone Number:
    <input type="text" name="phoneNumber" required>
    <br><br>

    <input type="submit" value="Update Patient">

</form>

</body>
</html>