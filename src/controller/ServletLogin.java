package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import pesistence.DaoUsuario;
import pesistence.IntDaoUsuario;
@WebServlet("/logar")
public class ServletLogin extends HttpServlet
{
	private static final long serialVersionUID = 299721511530694048L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		logar(req, resp);
	}

	private void logar(HttpServletRequest req, HttpServletResponse resp) 
	{
		String email = req.getParameter("idEmail");
		String senha = req.getParameter("idPass");
		if(!(email.contains("@") && email.contains(".com"))) 
		{
			try 
			{
				resp.sendRedirect("./login.jsp");
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		IntDaoUsuario dao = new DaoUsuario();
		try 
		{
			Usuario user = dao.autenticaUsuario(email, senha);
			if(user != null) 
			{
				req.getSession().setAttribute("USUARIO", user);
				resp.sendRedirect("./menu.jsp");
			}
			else 
			{
				resp.sendRedirect("./login.jsp");
			}
		}
		catch (SQLException | IOException e) 
		{
			e.printStackTrace();
		}
	}
}
