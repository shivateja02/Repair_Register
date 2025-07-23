<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Car Issue Registration</title>
</head>
<body>
    <h2 align="center">Register Your Car Issue</h2>
    <form action="CustomerServlet" method="post" align="center">
        <table align="center">
            <tr><td>Customer ID:</td><td><input type="number" name="customerId" required></td></tr>
            <tr><td>Name:</td><td><input type="text" name="name" required></td></tr>
            <tr><td>Car No:</td><td><input type="text" name="carNo" required></td></tr>
            <tr><td>Car Brand:</td><td><input type="text" name="carBrand" required></td></tr>
            <tr><td>Car Issue:</td><td><input type="text" name="carIssue" required></td></tr>
            <tr><td>Address:</td><td><input type="text" name="address" required></td></tr>
            <tr><td>Contact No:</td><td><input type="text" name="contact" required></td></tr>
            <tr><td colspan="2" align="center"><input type="submit" value="Register"></td></tr>
        </table>
    </form>
</body>
</html>
