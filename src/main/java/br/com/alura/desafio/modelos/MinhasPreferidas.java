package br.com.alura.desafio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        System.out.println("-----Minhas preferidas------");
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " É uma boa opção para passar o tempo");
        }
    }




}
