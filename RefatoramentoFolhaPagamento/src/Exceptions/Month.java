package Exceptions;

public class Month extends Exception {
    public Month() {
        super();
    }

    @Override
    public String toString() {
        return "Considere que um mês tem no máximo 31 dias.";
    }
}