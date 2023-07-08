package br.com.alura.desafio.principal;

import br.com.alura.desafio.modelos.MinhasPreferidas;
import br.com.alura.desafio.modelos.Musicas;
import br.com.alura.desafio.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {

        //Criando uma nova música
        Musicas minhamusica = new Musicas();
        minhamusica.setTitulo("God only know");
        minhamusica.setCantor("1:1");

        //Laço de repetição para utilizar os métodos de reproduzir e curtir.
        for (int i = 0; i < 1000; i++){
            minhamusica.reproduz();
        }

        for(int i = 0; i < 50; i++){
            minhamusica.curte();
        }

        minhamusica.setAlbum("January");
        minhamusica.setGenero("Gospel");

        minhamusica.curte();
        minhamusica.curte();
        minhamusica.curte();
        minhamusica.reproduz();
        minhamusica.reproduz();

        System.out.println("---------Músicas-------");
        System.out.println("Album: " + minhamusica.getAlbum());
        System.out.println("Cantor: " + minhamusica.getCantor());
        System.out.println("Genero: " + minhamusica.getGenero());
        System.out.println("Curtidas: " + minhamusica.getTotalDeCurtidas());
        System.out.println("Reproduções: " + minhamusica.getTotalDeReproducoes());


        //Criando um novo podcast
        Podcasts meupodcast = new Podcasts();
        meupodcast.setTitulo("Dia 01");
        meupodcast.setApresentador("Alexandre");

        //Laço de repetição para utilizar os métodos de reproduzir e curtir.
        for (int i = 0; i < 5000; i++){
            meupodcast.reproduz();
        }

        for(int i = 0; i < 1000; i++){
            meupodcast.curte();
        }

        meupodcast.setDescricao("Breve descrição do podcast");
        meupodcast.setEpisodios(14);

//        meupodcast.curte();
//        meupodcast.curte();
//        meupodcast.curte();
//        meupodcast.reproduz();
//        meupodcast.reproduz();
//        meupodcast.reproduz();

        System.out.println("---------Podcasts-------");
        System.out.println("Título: " + meupodcast.getTitulo());
        System.out.println("Apresentador: " + meupodcast.getApresentador());
        System.out.println("Descrição: " + meupodcast.getDescricao());
        System.out.println("Episódios: " + meupodcast.getEpisodios());

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }
}