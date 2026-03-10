package com.example;

public class Professor {
    private String nome;
    private int anosExeperiencia;

    public Professor(String nome, int anosExeperiencia) {
        this.nome = nome;
        this.anosExeperiencia = anosExeperiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExeperiencia() {
        return anosExeperiencia;
    }

    public String classifica() {
        return switch(anosExeperiencia) {
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", anosExeperiencia=" + anosExeperiencia + "]";
    }

    
}
