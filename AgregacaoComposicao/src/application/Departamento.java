package application;

import java.util.ArrayList;


//TODO é a parte que recebe no nosso caso é o Departamento
//PARTE é quem manda no nosso caso é o Professor e Curso
//Em um relacionamento muito forte a parte pode existir somente em um todo
//Em uam agregação a parte e o todo pode existir de forma independentes (relacionamento mais fraco)
//AGREGAÇÃO adiciona um item ja pronto ao  relacionamento
//COMPOSIÇÃO cria o item juntamente com a criação da  parte

public class Departamento {
	private String nome;
	private String areaAtuacao;
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	public String getAreaAtuacao() {
		return this.areaAtuacao;
	}
	
	//PRIMEIRA DIFERENÇÃO ENTRE AGREGAÇÃO E COMPOSIÇÃO
	//AGREGAÇÃO RECEBEMOS O OBJETO "PARTE" PRONTO (CRIADO NA MEMÓRIA)
	public void addFuncionario(Funcionario f) {
		this.funcionarios.add(f);
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		return this.funcionarios;
	}
	
	//Aqui muda para a composição
	//Recebemos os dados do objeto, criamos dentro do método
	//veja que vamos usar new no método addCurso()
	public void addCurso(String nome, int cargaHoraria) {
		Curso c = new Curso();
		c.setNome(nome);
		c.setCargaHoraria(cargaHoraria);
		this.cursos.add(c);
	}
	
	public ArrayList<Curso> getCursos(){
		return this.cursos;
	}
	
	public void addProfessores(Professor p) {
		this.professores.add(p);
	}
	
	public ArrayList<Professor> getProfessores(){
		return this.professores;
	}
	
	
//	public void exibirDados() {
//		System.out.println("***** CURSO *****");
//		if (this.cursos.size() == 0) {
//			System.out.println("Não há cursos cadastrados");
//			return;
//		}
//		for (Curso c : cursos) {
//			System.out.println("Curso: " + c.getNome());
//			System.out.println("CH...: " + c.getCargaHoraria());
//			for(Professor p : getProfessores()) {
//				p.exibirDados();
//			}
//		}
//	}
	public void exibirDados() {
		System.out.println("***** CURSOS *****");
		if(this.cursos.size() == 0) {
			System.out.println("Nã há cursos cadastrados");
		}
		else {
			for(Curso c : cursos) {
				c.exibirDados();
			}
		}
		System.out.println("\n***** Funcionarios *****");
		if(this.funcionarios.size() == 0) {
			System.out.println("Nã há funcionarios cadastrados");
		}
		else {
			System.out.println("");
			for(Funcionario f : this.funcionarios) {
				System.out.println("Nome..: " + f.getNome());
				System.out.println("RG....: " + f.getRg());
				System.out.println("Função: " + f.getFuncao());
				System.out.println("");
			}
		}
	}
	
	public void exibirProfessores() {
		System.out.println("\n***** Somente Professores *****");
		for(Funcionario f : this.funcionarios)
		{	if(f.getFuncao() == "Professor") {
				Professor p = (Professor)f;
				System.out.println("Nome..: " + p.getNome());
				System.out.println("RG....: " + p.getRg());
				System.out.println("Função: " + p.getFuncao());
				System.out.println("Espe..: " + p.getEspecialidade());
				System.out.println("");
			}
		}
	}
	
	public void exibirAdministrativo() {
		System.out.println("\n***** Somente Administrativo *****");
		for(Funcionario f : this.funcionarios)
		{	if(f.getFuncao() == "Tecnico-Administrativo") {
				Administrativo a = (Administrativo)f;
				System.out.println("Nome....: " + a.getNome());
				System.out.println("RG......: " + a.getRg());
				System.out.println("Função..: " + a.getFuncao());
				System.out.println("CodConve: " + a.getCodConvenio());
				System.out.println("");
			}
		}
	}
	

}
