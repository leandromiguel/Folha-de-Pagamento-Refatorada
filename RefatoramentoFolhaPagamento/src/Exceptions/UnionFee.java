package Exceptions;

public class UnionFee extends Exception {
    public UnionFee() {
        super();
    }

    @Override
    public String toString() {
        return "O sindicato não pode cobrar valores negativos ou maiores que R$20,00. A cobrança de algum valor nesse intervalo é obrigatória.";
    }
}