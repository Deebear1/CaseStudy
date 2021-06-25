<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fish</title>
<link href="css/fishlist.css" rel="stylesheet"/>
</head>
<body class="Bass">

<!-- <img src="https://image.shutterstock.com/image-vector/wtf-wheres-funny-fishing-design-260nw-1938085738.jpg" alt="WTF" style="float:right;width:1000px;height:300px;"> -->

</div><div class="slide-slow">


    <img src="https://pics.livejournal.com/rampanthers/pic/001e59ww" alt="Swimming fish">
    
    <h1>Think you caught your Personal Best? Lets record It!</h1>

    <h2>Fish Table</h2>
<div align="center">

    <h2>Fish List</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="add-fish">Add New Fish</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Color</th>
            <th>Habitat</th>
            <th>Size</th>
            <th>Lures</th>
           <th>Action</th> 
        </tr>
        <c:forEach items="${listFish}" var="fish">
        <tr>
            <td>${fish.id}</td>
            <td>${fish.name}</td>
            <td>${fish.color}</td>
            <td>${fish.habitat}</td>
            <td>${fish.size}</td>
            <td><c:forEach items="${fish.lures}" var="lure">
            <p>${lure.name}</p>
            </c:forEach>
            </td>
            
            <td>
                <a href="edit?id=${fish.id}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                
                <a href="delete?id=${fish.id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
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