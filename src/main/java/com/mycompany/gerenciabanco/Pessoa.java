package com.mycompany.gerenciabanco;

public class Pessoa {

    private String nomeCompleto;
    private String CPF;

    public Pessoa(String nomeCompleto, String CPF) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
