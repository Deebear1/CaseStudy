<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/fishlist.css" rel="stylesheet"/>
<meta charset="ISO-8859-1">
<title>Fish Data</title>
</head>
<body class="Fishy">
<img src="https://pics.livejournal.com/rampanthers/pic/001e59ww" alt="Swimming fish">
<h1>Think you caught your Personal Best? Lets record It!</h1>
	<div align="center">
		<h2>New Fish</h2>
		<form:form action="save" method="post" modelAttribute="fish">
			<table border="0" cellpadding="5">
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Color:</td>
					<td><form:input path="color" /></td>
				</tr>
				<tr>
					<td>Habitat:</td>
					<td><form:input path="habitat" /></td>
				</tr>
				<tr>
					<td>Size:</td>
					<td><form:input path="size" /></td>
				</tr>
				<tr>
					

				<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
		<form>
			<input type="button" value="cancel">
		</form>
	</div>
	<div class="bubbles bubble-1"></div>
    <div class="bubbles bubble-5"></div>
    <div class="bubbles bubble-2"></div>
    <div class="bubbles bubble-6"></div>
    <div class="bubbles bubble-3"></div>
    <div class="bubbles bubble-7"></div>
    <div class="bubbles bubble-4"></div>
    <div class="bubbles bubble-8"></div>

</body>
</html>