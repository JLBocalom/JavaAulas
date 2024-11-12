package application;

// Classe Aluno herda todos os atibutos e métodos 
// públicos da Classe Pessoa
public class Aluno extends Pessoa {
	private String ra;
	
	public Aluno(String nome, String rg, String ra) {
		super(nome, rg); //executa o contrutor de Pessoa
		this.ra = ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void exibirDados() {
		System.out.println("-----Aluno-----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG..: " + this.getRg());
		System.out.println("RA..: " + this.getRa());
	}
}

