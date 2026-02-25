<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
     <form action="register" method="post"> <br><br>
     Name : <input type="text" name="name"> <br><br>
     Age : <input type="number" name="age"> <br><br>
     Address : <textarea rows="5" cols="30" name="address"></textarea> <br><br>
     Course : <select name="course"> 
     <option value="B.com">B.com</option>
     <option value="BA">BA</option>
     <option value="B.sc">B.sc</option>
     </select> <br><br>
     <input type="submit" value="register">
     <input type="reset" value="cancel"> <br><br>
     <a href="viewAllStudents">View All Students</a>
     </form>
</body>
</html>