<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form-inline" action="/test/login-proc" method="post">
		<label for="email" class="mr-sm-2">Email address:</label> 
		<input type="email" class="form-control mb-2 mr-sm-2" placeholder="Enter email" id="email" name="id"> 
		<label for="pwd" class="mr-sm-2">Password:</label>
		<input type="password" class="form-control mb-2 mr-sm-2" placeholder="Enter password" id="pwd" name="pw">
		<div class="form-check mb-2 mr-sm-2">
			<label class="form-check-label"> <input class="form-check-input" type="checkbox"> Remember me
			</label>
		</div>
		<button type="submit" class="btn btn-primary mb-2">Submit</button>
	</form>
</body>
</html>