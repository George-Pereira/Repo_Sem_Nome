package model;

public class Usuario 
{
	private String nome;
	private String email;
	private String senha;
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario() 
	{
		
	}
	public Usuario(String nome, String email, String senha, long id) 
	{
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.id = id;
	}
	@Override
	public String toString() 
	{
		return this.nome;
	}
}
