package Exceptions;

public class Percentage extends Exception {
    public Percentage() {
        super();
    }

    @Override
    public String toString() {
        return "Não é permitido porcentagem de comissão menor que 0% ou maior que 100%";
    }
}