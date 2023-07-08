package br.com.alura.desafio.modelos;

public class Podcasts extends Audio{

    private String apresentador;
    private String descricao;
    private int episodios;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public int getClassificacao(){
        if(this.getTotalDeCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }

    }
}
