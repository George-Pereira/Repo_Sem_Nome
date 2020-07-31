<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="model.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jogo sem Nome - Menu Principal</title>
</head>
<body>
	<% 
	Usuario user = new Usuario();
	if((request.getSession().getAttribute("USUARIO") != null))
	{ 
		user = (Usuario)request.getSession().getAttribute("USUARIO");
	}
	else
	{
		response.sendRedirect("./login.jsp");
	}
	%>
	<div align="center">
		<button type="button" name="idRanking">Rankings</button>
		<button type="button" name="idJogar" onclick="">Nova Partida</button>
	</div>
</body>
</html>