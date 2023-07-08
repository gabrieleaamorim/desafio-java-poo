package br.com.alura.desafio.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public void curte(){
        this.totalDeCurtidas++;

    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
