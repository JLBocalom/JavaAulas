package application;

public class Administrativo extends Funcionario {
	private String codConvenio;
	
	public Administrativo(String nome, String rg, String codConvenio) {
		super(nome, rg, "Tecnico-Administrativo");
		this.codConvenio = codConvenio;
	}

	public void setCodConvenio(String codConvenio) {
		this.codConvenio = codConvenio;
	}
	public String getCodConvenio() {
		return this.codConvenio;
	}

}
