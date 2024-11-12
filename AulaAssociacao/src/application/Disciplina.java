package application;

public class Disciplina {
	// 1. Definir os atributos
	private String nome;
	private int cargaHoraria;
	private Professor professor;

	// 2. Definir o construtor, se houver necessidadae
	public Disciplina() {
	}

	// 3. Definir os metods assessores
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	// 4. Definir os metodos de função (se houver)
	public void exibirDados() {
		System.out.println("++++ DISCIPLINA ++++");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CH..: " + this.getCargaHoraria() + " Hrs");
	
		Professor professor = this.getProfessor();
		if (professor != null) {
			professor.exibirDados();
		}
	}
}
