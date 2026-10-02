<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Doctor</title>
</head>
<body>

    <h1>Add Doctor</h1>

    <form action="doctor" method="post">

        Doctor Name:
        <input type="text" name="doctorName">
        <br><br>

        Specialization:
        <input type="text" name="specialization">
        <br><br>

        Phone Number:
        <input type="text" name="phoneNumber">
        <br><br>

        <input type="submit" value="Add Doctor">

    </form>

</body>
</html>