package application;

public class Jogador {
    private String nome;
    private int numeroCamisa;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa ;
    }
}