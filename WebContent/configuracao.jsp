<%@page import="java.util.LinkedList"%>
<%@page import="model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="pesistence.DaoUsuario"%>
<%@page import="pesistence.IntDaoUsuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jogo sem nome - Configurações</title>
</head>
<body>
	<%
		IntDaoUsuario dao = new DaoUsuario();
		List<Usuario> usuarios = new LinkedList<Usuario>();	
		usuarios = dao.getUsuarios();
	%>
	<div align="center">
		<form action="./selecaoRodadas.jsp" method="post">
			<input type="number" name="nrodadas" value="4">
			<select name="jogs" id="jogadores">
			<%for(Usuario user : usuarios)
			{
				%>
				<option><%=user.getNome()%></option>
				<%
			}
			%>
			</select>
			<button type="button" onclick="adicionarJogador(jogadores)">Adicionar Jogador</button>
		</form>
	</div>
	<div align="center">
		<% //<table>
			//<thead>
				//<tr align="center">
					//<th>Nome do Jogador</th>
				//</tr>
			//</thead>
			//<tbody>
				//<tr align="center">
					
				//</tr>
			//</tbody>
		//</table>%>
	</div>
</body>
</html>