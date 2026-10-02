<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Doctor</title>
</head>
<body>

<h1>Update Doctor</h1>

<form action="updateDoctor" method="post">

    Doctor ID:
    <input type="number" name="doctorId" required>
    <br><br>

    Doctor Name:
    <input type="text" name="doctorName" required>
    <br><br>

    Specialization:
    <input type="text" name="specialization" required>
    <br><br>

    Phone Number:
    <input type="text" name="phoneNumber" required>
    <br><br>

    <input type="submit" value="Update Doctor">

</form>

</body>
</html>