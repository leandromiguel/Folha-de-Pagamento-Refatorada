package Exceptions;

public class Slavery extends Exception {
    public Slavery() {
        super();
    }

    @Override
    public String toString() {
        return "A lei só permite que um funcionário trabalhe até 10 horas por dia. Digite outra carga horária.";
    }
}