package br.com.victor.audio.model;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() >= 100) {
            return 10;
        } else if (this.getTotalDeCurtidas() >= 50) {
            return 7;
        } else {
            return 3;
        }
    }
}

