package application;

public class Funcionario extends Pessoa {
	private String funcao;

	public Funcionario(String nome, String rg, String funcao) {
		super(nome, rg);
		this.funcao = funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getFuncao() {
		return this.funcao;
	}

}
