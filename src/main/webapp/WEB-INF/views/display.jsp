<%@ page import="com.stackroute.keepnote.*" %>
<%@page import="com.stackroute.keepnote.model.Note"%>

<%@ page import="java.util.* "%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KeepNote</title>
</head>
<body>
	<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send 
		 button. Handle errors like empty fields -->
<%
List<Note>  li=null;
li=(List<Note>)request.getAttribute("a1");

%>

<center>
<h1>List of Notes</h1>

<table border="1">
<tr><th>Note ID</th><th>Note Title</th></tr>
<%
for(Note x: li){
	
%>
<tr><td><%= x.getNoteId() %></td>
<td><%= x.getNoteTitle() %></td>
</tr>
<%
}
%>
%>
</table>
</center>
	<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->
</body>
</html>