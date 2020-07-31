package pesistence;

import java.sql.SQLException;
import java.util.List;

import model.Usuario;

public interface IntDaoUsuario 
{
	public Usuario autenticaUsuario(String email, String password) throws SQLException;
	public void cadastraUsuario(String nome, String email, String senha) throws SQLException;
	public List<Usuario> getUsuarios()throws SQLException;
}
