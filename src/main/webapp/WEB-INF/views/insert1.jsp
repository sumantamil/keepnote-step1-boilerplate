
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
		<h1>Add New Students</h1>
		<form:form method="post" action="saveNote">
Note Id:<form:input path="noteId" />
			<br>
Note Title:<form:input path="noteTitle" />
			<br>
Note Content:<form:input path="noteContent" />
			<br>
Note Status:<form:input path="noteStatus" />
			<br>
Created At:<form:input path="createdAt" />
			<br>
			
			<input type="submit" value="save">
		</form:form>
</body>
</html>