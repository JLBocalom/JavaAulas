package cmd;

import java.util.Scanner;

import application.Aluno;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Funcionou");
		
		//básico de entrada/saida
		
		/*Estamos inicializando um objeto chamado "s" da classe Scanner.
		 * O método construtor recebe um parametro do tipo System.in
		 * 
		 * Syntaxe:
		 * Classe objeto = new Classe(parametros);
		 */
//		Scanner s = new Scanner(System.in);
//		System.out.println("Digite seu nome: ");		
//		String nome = s.nextLine();		
//		System.out.println("Meu nome é: " + nome);
//
//		int n1, n2, total;
//		System.out.println("Digite um número: ");
//		n1 = s.nextInt();
//		
//		System.out.println("Digite outro número: ");
//		n2 = s.nextInt();
//		
//		total = n1 + n2;
//		System.out.println("Soma: " + total);
		
		Aluno a1 = new Aluno(1234);
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno("Maria");
		
		a1.setNome("Zé");		
		System.out.println("Nome do aluno: " + a1.getNome());
	}

}
