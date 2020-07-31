package model;

public class Rodada 
{
	private int nRodada;
	private String assunto;
	private String idioma;
	public Rodada(int nRodada, String assunto, String idioma) 
	{
		this.nRodada = nRodada;
		this.assunto = assunto;
		this.idioma = idioma;
	}
	public int getnRodada() {
		return nRodada;
	}
	public void setnRodada(int nRodada) {
		this.nRodada = nRodada;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Rodada() 
	{
	}
}
