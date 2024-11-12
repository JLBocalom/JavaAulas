package application;

public class Autor {
	private String nome;
	private String nacionalidade;
	
	public Autor(String nome, String nacionalidade){
		this.setNome(nome); 
		this.setNacionalidade(nacionalidade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void exibirDetalhes() {
		System.out.println("Autor: " + nome + ", Nacionalidade: " + nacionalidade);
	}
}
