<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas Cadastradas</title>
</head>
<body>
	<h2>Lista de Empresas:</h2> <br/>
	<ul>
		<%
		List<Empresa> listaEmpresas = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : listaEmpresas) {
		%>
		<li><%= empresa.getNome()%></li>
		<%
		}
		%>
	</ul>
</body>
</html>