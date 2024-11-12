package application;

public class Professor {
	// 1. Definir os atributos
	private String nome;
	private String titulacao;
	private int ra;

	// 2. Definir o construtor, se houver necessidadae
	public Professor() {
	}

	// 3. Definir os metodos assessores
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getTitulacao() {
		return this.titulacao;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getRa() {
		return this.ra;
	}

	public void exibirDados() {
		System.out.println("++++ PROFESSOR ++++");
		System.out.println("Nome..: " + this.getNome());
		System.out.println("Titulo: " + this.getTitulacao());
		System.out.println("Ra....: " + this.getRa());
		System.out.println();
		System.out.println();
	}

}
