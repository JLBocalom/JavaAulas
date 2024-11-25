package application;

import java.util.ArrayList;

public class Partida {
    private Time time1;
    private Time time2;
    private ArrayList<Arbitro> arbitros;
    private int placarTime1;
    private int placarTime2;

    public Partida(Time time1, Time time2) {
        this.arbitros = new ArrayList<>();
        this.time1 = time1;
        this.time2 = time2;
        this.placarTime1 = 0;
        this.placarTime2 = 0;
    }

    public void adicionarArbitro(Arbitro arbitro) {
        if (arbitros.size() < 3) {
            arbitros.add(arbitro);
        } else {
            System.out.println("Já existem 3 árbitros cadastrados para a partida.");
        }
    }
    
    public void adicionarGolTime1() {
        placarTime1++;
    }

    public void adicionarGolTime2() {
        placarTime2++;
    }
    
    public boolean validarPartida() {
    	if (!time1.temJogadoresSuficientes() || !time2.temJogadoresSuficientes()) {
    	    System.out.println("A partida não pode ser iniciada. Ambos os times devem ter 11 jogadores.");
    	    return false;
    	}
        if (arbitros.size() != 3) {
            System.out.println("A partida não pode ser iniciada. É necessário 3 árbitros (1 principal e 2 bandeiras).");
            return false;
        }
        return true;
    }

    public void exibirPartida() {
        System.out.println("Partida entre " + time1.getNome() + " e " + time2.getNome() + "\n");
        System.out.println("Árbitros:");
        for (Arbitro arbitro : arbitros) {
            System.out.println("- " + arbitro.getNome() + " (" + arbitro.getFuncao() + ")");
        }
        System.out.println("\nPlacar final: " + time1.getNome() + " " + placarTime1 + " x " + placarTime2 + " " + time2.getNome());
        if (placarTime1 > placarTime2) {
            System.out.println(time1.getNome() + " é o vencedor!");
        } else if (placarTime2 > placarTime1) {
            System.out.println(time2.getNome() + " é o vencedor!");
        } else {
            System.out.println("A partida terminou empatada!");
        }
    }
}

