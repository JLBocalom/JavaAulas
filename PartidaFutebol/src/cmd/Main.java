package cmd;

import application.Arbitro;
import application.Jogador;
import application.Partida;
import application.Time;

public class Main {
	public static void main(String[] args) {
            // Criando jogadores para os times
            Time time1 = new Time("Flamengo");
            Time time2 = new Time("Corinthians");

            // Criando jogadores manualmente para o Time A
            time1.adicionarJogador(new Jogador("Carlos Souza", 1));
            time1.adicionarJogador(new Jogador("Lucas Silva", 2));
            time1.adicionarJogador(new Jogador("Guilherme Oliveira", 3));
            time1.adicionarJogador(new Jogador("Rafael Costa", 4));
            time1.adicionarJogador(new Jogador("Felipe Martins", 5));
            time1.adicionarJogador(new Jogador("Eduardo Lima", 6));
            time1.adicionarJogador(new Jogador("Júlio Rocha", 7));
            time1.adicionarJogador(new Jogador("Diego Almeida", 8));
            time1.adicionarJogador(new Jogador("Marcos Pereira", 9));
            time1.adicionarJogador(new Jogador("André Santos", 10));
            time1.adicionarJogador(new Jogador("Thiago Mendes", 11));

            // Criando jogadores manualmente para o Time B
            time2.adicionarJogador(new Jogador("Antonio Silva", 1));
            time2.adicionarJogador(new Jogador("Pedro Costa", 2));
            time2.adicionarJogador(new Jogador("Vinícius Almeida", 3));
            time2.adicionarJogador(new Jogador("João Pires", 4));
            time2.adicionarJogador(new Jogador("Daniel Rocha", 5));
            time2.adicionarJogador(new Jogador("Felipe Alves", 6));
            time2.adicionarJogador(new Jogador("Henrique Barbosa", 7));
            time2.adicionarJogador(new Jogador("Ricardo Pereira", 8));
            time2.adicionarJogador(new Jogador("Marcelo Silva", 9));
            time2.adicionarJogador(new Jogador("Gustavo Costa", 10));
            time2.adicionarJogador(new Jogador("Rogério Lima", 11));
            // Exibindo os jogadores dos times
            
            time1.exibirTime();
            System.out.println();
            time2.exibirTime();
            
            // Criando árbitros
            Arbitro arbitro1 = new Arbitro("José", "Principal");
            Arbitro arbitro2 = new Arbitro("André", "Bandeira 1");
            Arbitro arbitro3 = new Arbitro("Marcos", "Bandeira 2");

            // Criando partida
            Partida partida = new Partida(time1, time2);
            partida.adicionarArbitro(arbitro1);
            partida.adicionarArbitro(arbitro2);
            partida.adicionarArbitro(arbitro3);

            if (partida.validarPartida()) {
                System.out.println("Partida pode ser iniciada!");
                partida.adicionarGolTime1();
                partida.adicionarGolTime2();
                partida.adicionarGolTime1();           
                partida.exibirPartida();
            } else {
                System.out.println("A partida finalizada por haver pendencias.");
            }
    }
}
