<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Fish</title>
<link href="css/new-fish.css" rel="stylesheet">
</head>
<body>
<img src="https://image.shutterstock.com/image-vector/wtf-wheres-funny-fishing-design-260nw-1938085738.jpg" alt="WTF" style="float:right;width:950px;height:300px;">


    <img src="https://pics.livejournal.com/rampanthers/pic/001e59ww" alt="Swimming fish">
    
    <h1>Think you caught your Personal Best? Lets record It!</h1>
	<div align="center">
		<h2>Fish</h2>
		<form:form action="save" method="post" modelAttribute="Fish">
			<table border="0" cellpadding="5">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Color</th>
					<th>Size</th>
					<th>habitat</th>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>

				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
			<br>

			<h3>Lures</h3>

			<table id="t01">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>LiveBait</th>
					<th>Size</th>
					<th>Movement</th>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>

			<h4>Water</h4>

			<table id="t02">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Clarity</th>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>

				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>

			</table>
			<div class="bubbles bubble-1"></div>
    <div class="bubbles bubble-5"></div>
    <div class="bubbles bubble-2"></div>
    <div class="bubbles bubble-6"></div>
    <div class="bubbles bubble-3"></div>
    <div class="bubbles bubble-7"></div>
    <div class="bubbles bubble-4"></div>
    <div class="bubbles bubble-8"></div>
		</form:form>
		
		<form>
			<input type="button" value="cancel">
		</form>
	</div>
</body>
</html>