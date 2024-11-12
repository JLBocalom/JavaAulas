package application;

import java.util.ArrayList;

public class Aluno {
	// 1. Definir os atributos
	private String nome;
	private int ra;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	// 2. Definir o construtor, se houver necessidadae
	public Aluno() {
	}

	// 3. Definir os metodos assessores
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getRa() {
		return this.ra;
	}

	// RELACIONAMENTO DO TIPO AGREGAÇÃO
	public void matricular(Disciplina d) {
		this.disciplinas.add(d);
	}

	public ArrayList<Disciplina> getMatricula() {
		return this.disciplinas;
	}

	// 4. Definir os metodos de função (se houver)
	public void exibirDados() {
		System.out.println("++++ ALUNO ++++");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Ra..: " + this.getRa());

		for (Disciplina d : this.getMatricula()) {
			d.exibirDados();
		}
		System.out.println();
		System.out.println();
	}

}
