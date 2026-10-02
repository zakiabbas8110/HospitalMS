<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Find Patient</title>
</head>
<body>

<h1>Find Patient</h1>

<form action="findPatient" method="get">

    Patient ID:
    <input type="number" name="patientId" required>

    <input type="submit" value="Find Patient">

</form>

</body>
</html>