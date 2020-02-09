package Empregados;

import java.util.ArrayList;

public class EmpregadoDecorator implements Empregado {
    private Empregado empregado;

    public EmpregadoDecorator(Empregado empregado) {
        this.empregado = empregado;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    @Override
    public String getNome() {
        return this.empregado.getNome();
    }

    @Override
    public int getCodigo() {
        return this.empregado.getCodigo();
    }

    @Override
    public String getFuncao() {
        return this.empregado.getFuncao();
    }

    @Override
    public boolean eSindicalista() {
        return this.empregado.eSindicalista();
    }

    @Override
    public void setTaxaServico(double valor) {
        this.empregado.setTaxaServico(valor);
    }

    @Override
    public void setDescricaoServico(String descricao) {
        this.empregado.setDescricaoServico(descricao);
    }

    @Override
    public void setNome(String nome) {
        this.empregado.setNome(nome);
    }

    @Override
    public void setDiaPagamento(int dias) {
        this.empregado.setDiaPagamento(dias);
    }

    @Override
    public void setFuncao() {
        this.empregado.setFuncao();
    }

    @Override
    public void setFormaPagamento() {
        this.empregado.setFormaPagamento();
    }

    @Override
    public void setSindicato() {
        this.empregado.setSindicato();
    }

    @Override
    public void setRua() {
        this.empregado.setRua();
    }

    @Override
    public void setBairro() {
        this.empregado.setBairro();
    }

    @Override
    public void setCep() {
        this.empregado.setCep();
    }

    @Override
    public void setNumeroCasa() {
        this.empregado.setNumeroCasa();
    }

    @Override
    public ArrayList<Integer> getDiaPagamento() {
        return this.empregado.getDiaPagamento();
    }

    @Override
    public ArrayList<Double> getTaxaServico() {
        return this.empregado.getTaxaServico();
    }

    @Override
    public ArrayList<String> getDescricaoServico() {
        return this.empregado.getDescricaoServico();
    }

    @Override
    public double getSindicatoValor() {
        return this.empregado.getSindicatoValor();
    }

    @Override
    public void setNovoDiaPagamento(int dias) {
        this.empregado.setNovoDiaPagamento(dias);
    }

    @Override
    public String toString() {
        return this.empregado.toString();
    }
}