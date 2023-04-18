package br.com.ifsp.exape.model;

public enum Status {

    NOVO("NOVO"),
    ATRIBUIDO("ATRIBUIDO"),
    RESOLVIDO("RESOLVIDO"),
    ENCERRADO("ENCERRADO");

    private final String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
