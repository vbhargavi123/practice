<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color : red;
	}
</style>
</head>
<body>
<h1>Manage your profile here...</h1>
<hr/>
<!-- Spring form -->

<spring:form action="save" method="post" modelAttribute="student">
	<spring:label path="uname">Enter name</spring:label>
	<spring:input path="uname"/>
	<!-- Special spring form tag to show error message -->
	<spring:errors path="uname" cssClass="error"/>
	<br/>
	<br/>
	<spring:label path="email">Enter email</spring:label>
	<spring:input path="email"/>
	<br/>
	<br/>
	<spring:label path="freePasses">Enter free Passes</spring:label>
	<spring:input path="freePasses"/>
	<spring:errors path="freePasses" cssClass="error"/>
	<br/>
	<br/>
	<spring:label path="courseCode">Enter Course Code</spring:label>
	<spring:input path="courseCode"/>
	<spring:errors path="courseCode" cssClass="error"/>
	<br/>
	<br/>
	<spring:label path="country">Select country</spring:label>
	<spring:select path="country">
		<spring:options items="${student.countries}"/>
	<!--
		hard-coded list 
		<spring:option value="FR" label="France"/>
		<spring:option value="IN" label="India"/>
		<spring:option value="GR" label="Germany"/>
		<-spring:option value="US" label="USA"/>
	 -->	
	</spring:select>
	<br/>
	<br/>
	<spring:label path="favoriteLanguage">Select  Favorite Langauge</spring:label>
	<br/><spring:radiobutton path="favoriteLanguage" value="Python"/> Python
	<br/><spring:radiobutton path="favoriteLanguage" value="Java"/> Java
	<br/><spring:radiobutton path="favoriteLanguage" value="C#"/> C#
	<br/><spring:radiobutton path="favoriteLanguage" value="Javascript"/> Javascript
	<br/>
	<br/>
	<spring:label path="operatingSystems">Select your experience</spring:label>
	<br/><spring:checkbox path="operatingSystems" value="Linux"/> Linux
	<br/><spring:checkbox path="operatingSystems" value="Alpine"/> Alpine
	<br/><spring:checkbox path="operatingSystems" value="Mac"/> Mac
	<br/><spring:checkbox path="operatingSystems" value="Windows"/> Windows
	<br/>
	<br/>
	<input type="submit" value="Submit">
	
</spring:form>

</body>
</html>
















