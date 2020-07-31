package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pesistence.DaoUsuario;
import pesistence.IntDaoUsuario;

@WebServlet("/cadastra")
public class ServletCad extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		cadastro(req, resp);
	}

	private void cadastro(HttpServletRequest req, HttpServletResponse resp) 
	{
		String nome = req.getParameter("idNome");
		String email = req.getParameter("idEmail");
		String password = req.getParameter("idSenha");
		if(!(email.contains("@") && email.contains(".com"))) 
		{
			try 
			{
				resp.sendRedirect("./cadastro.jsp");
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else 
		{
			IntDaoUsuario dao = new DaoUsuario();
			try 
			{
				dao.cadastraUsuario(nome, email, password);
				resp.sendRedirect("./login.jsp");
			}
			catch (SQLException | IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}