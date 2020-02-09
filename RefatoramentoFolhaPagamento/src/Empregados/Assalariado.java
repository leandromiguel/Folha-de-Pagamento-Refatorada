package Empregados;

import Exceptions.ExceptionsAndGetString;

public class Assalariado extends EmpregadoDecorator {
    private double salario;

    public Assalariado(Empregado empregado) {
        super(empregado);
        setSalario();
    }

    public void setSalario() {
        System.out.println("Salário Mensal:");
        this.salario = ExceptionsAndGetString.tryingCatchDouble(900, 9000);
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Salário - R$" + this.salario + "\n";
    }
}