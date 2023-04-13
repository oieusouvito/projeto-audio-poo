package br.com.victor.audio.model;

public class Podcast extends Audio {

    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
