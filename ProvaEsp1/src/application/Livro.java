package application;

public class Livro {
	private String titulo;
	private int anoPublicacao;
	private Autor autor;
	
	public Livro(String titulo, int anoPublicacao){
		this.setTitulo(titulo); 
		this.setAnoPublicacao(anoPublicacao);
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return this.titulo;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Autor getAutor() {
		return this.autor;
	}
	
	public void exibirDetalhes() {
		System.out.println("Livro: " + titulo + ", Ano de Publicação: " + anoPublicacao);
		autor.exibirDetalhes();
		System.out.println();
	}
	
}
