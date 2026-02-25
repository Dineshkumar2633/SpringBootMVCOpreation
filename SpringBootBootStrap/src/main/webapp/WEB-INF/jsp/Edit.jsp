<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<script src ="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
<style type="text/css">
       .card
       {
           position:absolute;
           top:50%;
           left:50%;
           transform:translate(-50%, -50%);
       }
</style>
</head>
<body>
      <div class="card col-sm-4">
      <div class="card-body">
      <h1 class="card-title bg-warning text-center text-light">Edit Product</h1>
      <form:form action="/update" method="post" modelAttribute="product">
      
      <div class="form">
      <lable for="id">Product ID</lable>
      <form:input type="hidden" path="id" class="form-control"/>
      </div><br>
      
      <div class="form">
      <lable for="pname">Product Name</lable>
      <form:input path="pname" class="form-control"/>
      </div>
      
      <div class="form">
      <label for="cname">Company Name</label>
      <form:input path="cname" class="form-control"/>
      </div>
      
      <div class="form">
      <lable for="price">Price</lable>
       <form:input path="price" class="form-control"/>
       </div><br>
       
      <button type="submit" class="btn btn-primary"><i class="bi bi-box-arrow-right"></i> Update</button>
      </form:form>
      </div>
      </div>
</body>
</html>