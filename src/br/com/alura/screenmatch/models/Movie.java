package br.com.alura.screenmatch.models;

public class Movie extends Title implements Classifiable {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) returnAverage() / 2;
    }
}
