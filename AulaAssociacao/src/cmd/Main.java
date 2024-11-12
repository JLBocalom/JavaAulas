package cmd;

import application.Aluno;
import application.Disciplina;
import application.Professor;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Ximbinha dos Anjos");
		a1.setRa(1452654);
		a1.exibirDados();

		Professor p1 = new Professor();
		p1.setNome("Joelma du Ximba");
		p1.setRa(8547365);
		p1.setTitulacao("Mestrado");
		p1.exibirDados();

		Professor p2 = new Professor();
		p2.setNome("Lua me Traiu");
		p2.setRa(666333);
		p2.setTitulacao("Traição");
		p2.exibirDados();

		Disciplina d1 = new Disciplina();
		d1.setNome("Rede de compiuters");
		d1.setCargaHoraria(90);
		d1.setProfessor(p1);

		Disciplina d2 = new Disciplina();
		d2.setNome("Engenharia dos compiuter");
		d2.setCargaHoraria(60);
		d2.setProfessor(p2);

		// desejo matricular um aluno
		a1.matricular(d1);
		a1.exibirDados();

		a1.matricular(d2);
		a1.exibirDados();

	}

}
