package application;

public class Pessoa {
	private String nome;
	private String rg;
	
	public Pessoa(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getRg() {
		return this.rg;
	}
}
