package Informacoes;

import Exceptions.ExceptionsAndGetString;

public class EnderecoBuilder {
    private String rua;
    private String bairro;
    private int numeroCasa;
    private String cep;

    public EnderecoBuilder() {
        setRua();
        setBairro();
        setCep();
        setNumeroCasa();
    }

    private void setRua() {
        System.out.println("Rua:");
        this.rua = ExceptionsAndGetString.getString();
    }

    private void setBairro() {
        System.out.println("Bairro:");
        this.bairro = ExceptionsAndGetString.getString();
    }

    private void setCep() {
        System.out.println("CEP:");
        this.cep = ExceptionsAndGetString.getString();
    }

    private void setNumeroCasa() {
        System.out.println("Número da casa:");
        this.numeroCasa = ExceptionsAndGetString.tryingCatchInt();
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public String getCep() {
        return cep;
    }
}
