<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Patient</title>
</head>
<body>

<h1>Add Patient</h1>

<form action="patient" method="post">

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

    <input type="submit" value="Add Patient">

</form>

</body>
</html>