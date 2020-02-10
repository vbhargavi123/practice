<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Manage your profile here...</h1>
<hr/>
<!-- Spring form -->

<spring:form action="save" method="post" modelAttribute="student">
	<spring:label path="uname">Enter name</spring:label>
	<spring:input path="uname"/>
	<br/>
	<br/>
	<spring:label path="email">Enter email</spring:label>
	<spring:input path="email"/>
	<br/>
	<br/>
	<spring:label path="favoriteLanguage">Select  Favorite Language</spring:label>
	<br/><spring:radiobutton path="favoriteLanguage" value="Python"/> Python
	<br/><spring:radiobutton path="favoriteLanguage" value="Java"/> Java
	<br/><spring:radiobutton path="favoriteLanguage" value="C#"/> C#
	<br/><spring:radiobutton path="favoriteLanguage" value="Javascript"/> Javascript
	<br/>
	<br/>
		
	<input type="submit" value="Submit">
	
</spring:form>

</body>
</html>
















