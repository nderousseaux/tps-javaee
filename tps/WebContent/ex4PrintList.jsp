<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PrintList</title>
</head>
<body>

	<%="<ul>" %>
	<%for(String s : (ArrayList<String>)request.getAttribute("list")){%>
		<%="<li>"+ s +"</li>" %>
	<% }%>
	<%="<ul>" %>
</body>
</html>
