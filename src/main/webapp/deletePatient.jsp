<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Patient</title>
</head>
<body>

<h1>Delete Patient</h1>

<form action="deletePatient" method="post">

    Patient ID:
    <input type="number" name="patientId" required>
    <br><br>

    <input type="submit" value="Delete Patient">

</form>

</body>
</html>