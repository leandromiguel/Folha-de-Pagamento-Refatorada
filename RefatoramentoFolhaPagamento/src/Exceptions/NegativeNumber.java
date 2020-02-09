package Exceptions;

public class NegativeNumber extends Exception {
    public NegativeNumber() {
        super();
    }

    @Override
    public String toString() {
        return "São permitidos apenas valores maiores que 0.";
    }
}