package br.com.ifsp.exape.model;

public enum Papel {

    ANALISTA("ANALISTA"),
    CLIENTE("CLIENTE");

    private final String descricao;

    Papel(String papel) {
        this.descricao = papel;
    }

    public String getDescricao(){
        return descricao;
    }
}
