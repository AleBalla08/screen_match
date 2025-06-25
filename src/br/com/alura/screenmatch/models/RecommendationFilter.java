package br.com.alura.screenmatch.models;

public class RecommendationFilter {
    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do catálogo!");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Assista agora!");
        }
    }
}
