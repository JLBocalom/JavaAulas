package application;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogadores.size() >= 11) {
            System.out.println("O time não pode ter mais de 11 jogadores.");
        } else {
            jogadores.add(jogador);
        }
    }
    public boolean temJogadoresSuficientes() {
        if (jogadores.size() == 11) {
            return true;
        } else {
            return false;
        }
    }
    public void exibirTime() {
        System.out.println("Time: " + nome);
        System.out.println("    Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println("      - Nome: " + jogador.getNome() + ", Camisa: " + jogador.getNumeroCamisa());
        }
        System.out.println("");
    }
}