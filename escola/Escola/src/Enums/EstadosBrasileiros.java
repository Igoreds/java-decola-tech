package Enums;

public enum EstadosBrasileiros {
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    SAO_PAULO ("SP", "São Paulo"),
    PIAUI ("PI", "Piauí"),
    PERNAMBUCO ("PE", "Pernambuco");

    private String sigla;
    private String nome;

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla; 
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
