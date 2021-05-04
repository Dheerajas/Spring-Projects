<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Locations</title>
</head>
<body>
<h1>All Locations</h1>
<table border="1">
<tr>
<th>Id</th>
<th>City Name</th>
<th>City Code</th>
<th>PinCode</th>
<th>Delete</th>
</tr>
<c:forEach items="${locations}" var="location" >
<tr>
<td>${location.id}</td>
<td>${location.city_name}</td>
<td>${location.city_code}</td>
<td>${location.pincode}</td>

<td><a href="deleteById?id=${location.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>