package Empregados;

import Exceptions.*;

public class Horista extends EmpregadoDecorator {
    private double horistaSalario;
    private double tempoTrabalho;
    private double horaExtra;

    public Horista(Empregado empregado) {
        super(empregado);
        setHoristaSalario();
        this.tempoTrabalho = 0;
        this.horaExtra = 0;
    }

    public void setHoristaSalario() {
        System.out.println("Salário por hora:");
        this.horistaSalario = ExceptionsAndGetString.tryingCatchDouble(5, 50);
    }

    public void resetTempo() {
        this.horaExtra = 0;
        this.tempoTrabalho = 0;
    }

    public double getHoristaSalario() {
        return horistaSalario;
    }

    public double getTempoTrabalho() {
        return tempoTrabalho;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void addTempoTrabalho(double tempo) {
        if (tempo > 8) {
            this.tempoTrabalho += 8;
            this.horaExtra += tempo - 8;
        } else this.tempoTrabalho += tempo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Salário por Hora - R$ " + this.horistaSalario + "\n"
                + "Horas trabalhadas desde o último pagamento - " + (this.tempoTrabalho + this.horaExtra) + "h\n";
    }
}