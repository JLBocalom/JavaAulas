package application;


//TODO é a parte que recebe no nosso caso é o Departamento
//PARTE é quem manda no nosso caso é o Professor e Curso
//Em um relacionamento muito forte a parte pode existir somente em um todo
//Em uam agregação a parte e o todo pode existir de forma independentes (relacionamento mais fraco)
//AGREGAÇÃO adiciona um item ja pronto ao  relacionamento
//COMPOSIÇÃO cria o item juntamente com a criação da  parte

public class Professor extends Funcionario{
	private String especialidade;
	
	public Professor(String nome, String rg, String especialidade) {
		super(nome, rg, "Professor");
		this.especialidade = especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
}
