<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Doctor</title>
</head>
<body>

<h1>Delete Doctor</h1>

<form action="deleteDoctor" method="post">

    Doctor ID:
    <input type="number" name="doctorId" required>

    <br><br>

    <input type="submit" value="Delete Doctor">

</form>

</body>
</html>