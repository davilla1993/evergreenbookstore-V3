<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/style.css"/>
	<link rel="stylesheet" href="css/book_detail.css"/>
	
	<script type="text/javascript" src="js/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="js/jquery.validate.min.js"></script>
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.js"></script>
	
	
	<title>Evergreen Bookstore - Review Posted</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	
	<div align="center">
			
			<table class="normal" width="60%">
				<tr>
					<td><h2>Your Review</h2></td>
					<td>&nbsp;</td>
					<td><h2>${loggedCustomer.fullname}</h2></td>
				</tr>
				<tr>
					<td colspan="3"><hr/></td>
				</tr>
				<tr>
					<td>
						<span id="book-title">${book.title}</span><br/>
						<img src="data:image/jpg;base64,${book.base64Image}" class="reviewImage"/>	
					</td>
					<td align="left">
					
						<h3>Your review has been posted. Thank you !!!</h3>
						
					</td>
				</tr>
		
			</table>
	</div>
	
	<jsp:directive.include file="footer.jsp" />
</body>


</html>