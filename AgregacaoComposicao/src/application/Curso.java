package application;


//TODO é a parte que recebe no nosso caso é o Departamento
//PARTE é quem manda no nosso caso é o Professor e Curso
//Em um relacionamento muito forte a parte pode existir somente em um todo
//Em uam agregação a parte e o todo pode existir de forma independentes (relacionamento mais fraco)
//AGREGAÇÃO adiciona um item ja pronto ao  relacionamento
//COMPOSIÇÃO cria o item juntamente com a criação da  parte

public class Curso {
	private String nome;
	private int cargaHoraria;
//	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
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
	
	//PRIMEIRA DIFERENÇÃO ENTRE AGREGAÇÃO E COMPOSIÇÃO
	//AGREGAÇÃO RECEBEMOS O OBJETO "PARTE" PRONTO (CRIADO NA MEMÓRIA)
//	public void addProfessor(Professor p) {
//		this.professores.add(p);
//	}
//	
//	public ArrayList<Professor> getProfessores(){
//		return this.professores;
//	}
	
	
//	public void exibirDados() {
//		
//		if (this.getProfessores().size() == 0 ) {
//			System.out.println("Nenhum professor cadastrado");
//			return;
//		}
//		System.out.println("============ Lista de Professores ============");
//		for (Professor p : professores) {
//			p.exibirDados();
//		}
//	}
	public void exibirDados() {
		System.out.println("\n ------ CURSO ------");
		System.out.println("Curso: " + this.getNome());
		System.out.println("CH...: " + this.getCargaHoraria());
	}
}
