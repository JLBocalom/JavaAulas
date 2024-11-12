package cmd;


//TODO é a parte que recebe no nosso caso é o Departamento
//PARTE é quem manda no nosso caso é o Professor e Curso
//Em um relacionamento muito forte a parte pode existir somente em um todo
//Em uam agregação a parte e o todo pode existir de forma independentes (relacionamento mais fraco)


import application.Departamento;
import application.Professor;
import application.Aluno;
import application.Administrativo;


public class Main {
	public static void main(String[] args){
	
//	Professor p1 = new Professor();
//	p1.setNome("João");
//	p1.setEspecialidade("Banco de Dados");
//	
//	Professor p2 = new Professor();
//	p2.setNome("Pedro");
//	p2.setEspecialidade("Programação");
	
	// ------------------------------------------
	
	
//	Curso c1 = new Curso();
//	c1.setNome("ADS");
//	c1.setCargaHoraria(2000);
//	c1.addProfessor(p1); // Agregação
//	c1.addProfessor(p2); // Agregação
	
	// ------------------------------------------
	
//	Departamento d1 = new Departamento();
//	d1.setNome("Computação");
//	d1.setAreaAtuacao("Exatas");
//	d1.addCurso("ADS", 2000);; // composição
//	d1.addCurso("Eng. Computação", 2000);; // composição
//	d1.addCurso("Ciencia da Computação", 2000);; // composição
//	d1.addCurso("Gestão de TI", 2000);; // composição
//	d1.addProfessor(p1); // Agregação
//	d1.addProfessor(p2); // Agregação
//	d1.exibirDados();

	// ------------------------------------------
	
//	Aluno a1 = new Aluno ("Nome do Aluno 1", "12345678-X", "100123");
//	a1.exibirDados();
//	a1.setNome("Novo Nome do Aluno");
//	a1.setRg("87654321-Y");
//	a1.setRa("10999");
//	a1.exibirDados();
	
	// ------------------------------------------
	
//	Administrativo adm1 = new Administrativo("Renato", "12345678-X", "conv-1234");
//	System.out.println("Nome....: "+ adm1.getNome());//vem de Pessoa
//	System.out.println("Funcao..: "+ adm1.getFuncao());//vem de Funcionario
//	System.out.println("Convenio: "+ adm1.getCodConvenio());//vem de Administrativo
//	
//	System.out.println("--------------------------------------------------");
	
//	Professor p1 = new Professor("Renato", "12345678-X", "Orientado a Objeto");
//	System.out.println("Nome....: "+ p1.getNome());//vem de Pessoa
//	System.out.println("Funcao..: "+ p1.getFuncao());//vem de Funcionario
//	System.out.println("Convenio: "+ p1.getEspecialidade());//vem de Administrativo
	Administrativo adm1 = new Administrativo("Nome Adm-1", "12345678-X", "conv-1234");
	Administrativo adm2 = new Administrativo("Nome Adm-2", "87654321-X", "conv-8910");
	Administrativo adm3 = new Administrativo("Nome Adm-3", "15975368-X", "conv-4567");
	
	Professor p1 = new Professor("Nome Prof-1", "555666-x", "Orientado a Objeto");
	Professor p2 = new Professor("Nome Prof-1", "444777-x", "Banco de Dados");
	
	Departamento dept1 = new Departamento();
	dept1.setNome("Computação e Matemática");
	dept1.setNome("Exatas");
	dept1.addCurso("ADS", 2000);
	dept1.addCurso("Fisica", 3000);;
	
	dept1.addFuncionario(adm1);
	dept1.addFuncionario(adm2);
	dept1.addFuncionario(adm3);
	dept1.addFuncionario(p1);
	dept1.addFuncionario(p2);
	
	dept1.exibirDados();
	dept1.exibirProfessores();
	dept1.exibirAdministrativo();
	
	}
}
