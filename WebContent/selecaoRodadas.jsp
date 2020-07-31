<%@page import="model.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jogo Sem Nome - Rodadas</title>
</head>
<body>
	<% List<Usuario> users = (List<Usuario>) request.getSession().getAttribute("JOGADORES");
	   int nrods = Integer.parseInt(request.getParameter("nrodadas"));
	%>
	<div align="center">
		<form action="./configurar" method="get">
			<%
				for(int i = 0; i < nrods; i++)
				{
					
				}
			%>
		</form>
	</div>
</body>
</html>