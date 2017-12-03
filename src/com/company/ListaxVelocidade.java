package com.company;

public class ListaxVelocidade{

    String tipoDeLista;
    long tempoDeProcessamento;

    public ListaxVelocidade(String tipoDeLista, long tempoDeProcessamento) {
        this.tipoDeLista = tipoDeLista;
        this.tempoDeProcessamento = tempoDeProcessamento;
    }

    public String getTipoDeLista() {
        return tipoDeLista;
    }

    public void setTipoDeLista(String tipoDeLista) {
        this.tipoDeLista = tipoDeLista;
    }

    public long getTempoDeProcessamento() {
        return tempoDeProcessamento;
    }

    public void setTempoDeProcessamento(long tempoDeProcessamento) {
        this.tempoDeProcessamento = tempoDeProcessamento;
    }
}
