package pesistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Usuario;

public class DaoUsuario implements IntDaoUsuario
{
	private Connection connect;
	public DaoUsuario() 
	{
		IntDaoGenerica daogen = new DaoGenerica();
		connect = daogen.getConnection();
	}
	@Override
	public Usuario autenticaUsuario(String email, String password) throws SQLException 
	{
		Usuario user = new Usuario();
		String sql = "SELECT * FROM fn_validaLogin(?,?)";
		PreparedStatement stmt = connect.prepareStatement(sql);
		stmt.setString(1, email);
		stmt.setString(2, password);
		ResultSet resultado = stmt.executeQuery();
		if(resultado.next()) 
		{
			user.setId(resultado.getLong("id"));
			user.setNome(resultado.getString("nome"));
			user.setSenha(resultado.getString("pass"));
			user.setEmail(resultado.getString("email"));
		}
		return user;
	}
	@Override
	public void cadastraUsuario(String nome, String email, String senha) throws SQLException 
	{
		String sql = "INSERT INTO usuario (nome, email, passw) VALUES (?,?,?)";
		PreparedStatement state = connect.prepareStatement(sql);
		state.setString(1, nome);
		state.setString(2, email);
		state.setString(3, senha);
		state.execute();
	}
	@Override
	public List<Usuario> getUsuarios() throws SQLException 
	{
		List<Usuario> lista = new LinkedList<Usuario>();
		String sql = "SELECT * FROM usuario";
		PreparedStatement stmt = connect.prepareStatement(sql);
		ResultSet result = stmt.executeQuery();
		while(result.next()) 
		{
			Usuario user = new Usuario();
			user.setId(result.getLong("id"));
			user.setNome(result.getString("nome"));
			user.setEmail(result.getString("email"));
			user.setSenha(result.getString("passw"));
			lista.add(user);
		}
		return lista;
	}
}
