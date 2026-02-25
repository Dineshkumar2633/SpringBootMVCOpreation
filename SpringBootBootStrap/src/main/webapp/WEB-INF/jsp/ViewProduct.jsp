<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Product</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<script src ="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
</head>
<body>
      <h1 class="text-center">View All Products</h1>
      <table class="table" border="2">
      <tr class="table-row bg-info text-light">
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Company Name</th>
          <th>Price</th>
          <th>Edit</th>
          <th>Delete</th>
      </tr>
      <c:forEach var="Product" items="${product }">
      <tr>
          <td>${Product.id }</td>
          <td>${Product.pname }</td>
          <td>${Product.cname }</td>
          <td class="badge bg-info text-light">${Product.price }</td>
          <td><a href="edit/${Product.id }" role="buttton" class="btn btn-success"><i class="bi bi-pencil"></i> Edit</a></td>
          <td><a href="delete/${Product.id }" onclick = "return confirm('Delete This Product')" role="button" class="btn btn-danger"><i class="bi bi-trash3"></i> Delete</a></td>
      </tr>
      </c:forEach>
      </table>
</body>
</html>