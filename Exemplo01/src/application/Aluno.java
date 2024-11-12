package application;

//definição da classe como pública
//nome da classe Aluno
public class Aluno {
	//1. atributos (dados da classe - privados)
	private String nome;
	private int ra;
	
	
	//2.construtores (opcional)
	//método sem retorno com o mesmo nome da Classe
	public Aluno() {
		
	}
	public Aluno(int ra ) {
		this.ra = ra;
		
	}
	public Aluno(String nome) {
		this.setNome(nome);
	}
	
	//3.métodos assessores (publicos) 
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public String getNome() {
		return this.nome;
	}
	
	
	//4.métodos diversos (funcionalidades)
	
	
}	
