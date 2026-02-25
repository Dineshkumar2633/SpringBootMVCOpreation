<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<script src ="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
<style type="text/css">
   .card
   {
       position:absolute;
       top:20%;
       left:35%;
       transform:translate(-50%, -50%);
   }
</style>
</head>
<body>
      <div class="card col-sm-4">
      <div class="card-body">
      <div class="card-title bg-success text-light text-center"><h1>Product Insert Page</h1></div>
      <form:form action="login" method="post" modelAttribute="product">
      
      <div class="form-group">
      <label for="pname">Product Name </label>
      <form:input type="text" path="pname" placeholder="Enter The ProductName" class="form-control"/>
      </div>
      
      <div class="form-group">
      <label for="cname">Company Name</label>
      <form:input type="text" path="cname" placeholder="Enter The CompanyName" class="form-control"/>
      </div>
      
      <div class="form-group">
      <label for="price">Price</label> 
      <form:input type="number" path="price" placeholder="Enter The Price" class="form-control"/>
      </div>
      <button type="submit" class="btn btn-primary"><i class="bi bi-floppy"></i> Add Product</button>
      <button type="reset" class="btn btn-dark"><i class="bi bi-x-circle"></i> Cancel</button>
      </form:form><br>
      <button class="btn btn-danger"><a href="view"><i class="bi bi-file-earmark"></i> View All Product</a></button>
      </div>
      </div>
</body>
</html>