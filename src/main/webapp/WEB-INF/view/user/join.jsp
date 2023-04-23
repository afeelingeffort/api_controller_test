<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css"></style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form class="form-inline" action="/user/join-proc" method="post">
		<label for="email" class="mr-sm-2">Email address:</label> 
		<input type="email" class="form-control mb-2 mr-sm-2" placeholder="Enter email" id="email" name="id"> 
		<label for="pwd" class="mr-sm-2">Password:</label>
		<input type="password" class="form-control mb-2 mr-sm-2" placeholder="Enter password" id="pwd" name="pw">
		<label for="phoneNumber" class="mr-sm-2">Phonenumber:</label>
		<input type="tel" class="form-control mb-2 mr-sm-2" placeholder="Enter PhoneNumber" id="phoneNumber" name="phoneNumber">
		<label for="address" class="mr-sm-2">Address:</label>
		<input type="text" class="form-control mb-2 mr-sm-2" placeholder="Enter Address" id="address" name="address">
		<div class="form-check mb-2 mr-sm-2">
			<label class="form-check-label"> <input class="form-check-input" type="checkbox"> Remember me
			</label>
		</div>
		<button type="submit" class="btn btn-primary mb-2">Submit</button>
	</form>
</body>
</html>