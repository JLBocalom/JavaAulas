package cmd;

import application.Autor;
import application.Livro;

public class Main {
	public static void main(String[] args) {
		Autor A1 = new Autor("KENEDY João", "Estados Unidos - EUA");
		//A1.exibirDetalhes();
		
		Autor A2 = new Autor("COSTA Vinicius", "Brasil - BR");
		//A2.exibirDetalhes();
		
		Autor A3 = new Autor("SILVA Leonardo", "Brasil - BR");
		//A3.exibirDetalhes();
		
		System.out.println("------------------------------------");	
		
		Livro l1 = new Livro("Historias Encantandas", 1997);
		l1.setAutor(A1);
		l1.exibirDetalhes();
		
		Livro l2 = new Livro("Contos Inacabados", 1989);
		l2.setAutor(A3);
		l2.exibirDetalhes();
		
		Livro l3 = new Livro("O Hobbit", 2005);
		l3.setAutor(A2);
		l3.exibirDetalhes();
		
		Livro l4 = new Livro("O Hobbit 22222", 2005);
		l4.exibirDetalhes();


	}
}
