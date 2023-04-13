package br.com.victor.audio.model;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado magnífico!");
        } else if (audio.getClassificacao() >= 7) {
            System.out.println(audio.getTitulo() + " é considerado bom.");
        } else {
            System.out.println(audio.getTitulo() + " é considerado ruim.");
        }
    }
}
