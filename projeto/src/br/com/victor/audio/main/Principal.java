package br.com.victor.audio.main;

import br.com.victor.audio.model.MinhasPreferidas;
import br.com.victor.audio.model.Musica;
import br.com.victor.audio.model.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica flowers = new Musica();

        flowers.setArtista("Miley Cyrus");
        flowers.setAlbum("Endless Summer Vacation");
        flowers.setGenero("Pop");
        flowers.setTitulo("Flowers");

        for (int i = 0; i < 1000; i++) {
            flowers.reproduzir();
        }

        for (int i = 0; i < 150; i++) {
            flowers.curtir();
        }

        Podcast diaCast = new Podcast();

        diaCast.setTitulo("URIAS fala sobre música, moda, estilo e seus novos projetos");
        diaCast.setDescricao("Urias se tornou um dos nomes mais comentados da música atualmente." +
                "Também se tornou referência na moda e estética, participando de desfiles no Brasil" +
                "e no exterior. Ela chega no DiaCast pronta pra falar sobre seus projetos, sonhos" +
                "e muita fofoca!");
        diaCast.setHost("DiaCast");

        for (int i = 0; i < 10000; i++) {
            diaCast.reproduzir();
        }

        for (int i = 0; i < 5; i++) {
            diaCast.curtir();
        }

        System.out.println(flowers.getTotalDeCurtidas());
        System.out.println(flowers.getTotalDeReproducoes());

        System.out.println(diaCast.getTotalDeCurtidas());
        System.out.println(diaCast.getTotalDeReproducoes());

        MinhasPreferidas mp = new MinhasPreferidas();

        mp.inclui(flowers);
        mp.inclui(diaCast);
    }
}
