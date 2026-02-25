<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>View All Students</title>
</head>
<body>
     <h1>View All Students</h1>
     <table border="2" width="70%">
       <tr><th>StudentId</th><th>StudentName</th><th>Age</th><th>Address</th><th>Course</th></tr>
       <c:forEach var="Student" items="${Students}">
       <tr>
         <td>${Student.id}</td>
         <td>${Student.name}</td>
         <td>${Student.age}</td>
         <td>${Student.address}</td>
         <td>${Student.course}</td>
       </tr>
       </c:forEach>
     </table>
</body>
</html>