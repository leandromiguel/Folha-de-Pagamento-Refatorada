package Empregados;

import java.util.ArrayList;

public interface Empregado {
    String getNome();
    int getCodigo();
    String getFuncao();
    boolean eSindicalista();
    void setTaxaServico(double valor);
    void setDescricaoServico(String descricao);
    void setNome(String nome);
    void setDiaPagamento(int dias);
    void setFuncao();
    void setFormaPagamento();
    void setSindicato();
    void setRua();
    void setBairro();
    void setCep();
    void setNumeroCasa();
    ArrayList<Integer> getDiaPagamento();
    ArrayList<Double> getTaxaServico();
    ArrayList<String> getDescricaoServico();
    double getSindicatoValor();
    void setNovoDiaPagamento(int dias);
}