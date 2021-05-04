<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location App</title>
</head>
<body>
<h1>Create Locations Form</h1>
<form action="createLocation" method="post">

<hr>
<table >
<tr>
<td>City Name:</td>
<td><input type="text" name="city_name" ></td>
</tr>
<tr>
<td>City Code:</td>
<td><input type="text" name="city_code"></td>
</tr>
<tr>
<td>Pin Code:</td>
<td><input type="text" name="pincode"></td>
</tr>

<tr>
<td><input type="submit" value="SaveLocation"></td>
</tr>
</table>
</form>

</body>
</html>