package br.com.alura.screenmatch.exceptions;

public class ConvertYearException extends RuntimeException {
    private String message;

    public ConvertYearException(String s) {
        message = s;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
