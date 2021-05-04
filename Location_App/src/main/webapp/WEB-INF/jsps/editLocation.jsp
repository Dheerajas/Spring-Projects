<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Location</title>
</head>
<body>
<h1>Edit Location Form</h1>
<hr>
<h2>${location.id}</h2>
<form method="post" action="updatePost">
<table >
<tr>
<td><input type="hidden" name="id" value="${location.id}"></td>
</tr>
<tr>
<td>City Name:</td>
<td><input type="text" name="city_name" value="${location.city_name}"></td>
</tr>
<tr>
<td>City Code:</td>
<td><input type="text" name="city_code" value="${location.city_code}"> </td>
</tr>
<tr>
<td>Pin Code:</td>
<td><input type="text" name="pincode" value="${location.pincode}"></td>
</tr>

<tr>
<td><input type="submit" value="EditLocation"></td>
</tr>
</table>
</form>
</body>
</html>