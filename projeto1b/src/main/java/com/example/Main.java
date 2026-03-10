package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nome do Professor");
        String nome = in.nextLine();
        System.out.println("Quantos anos de exeperiencia ele tem?");
        int exeperiencia = in.nextInt();
        Professor p = new Professor(nome,exeperiencia);
        System.out.println(p.toString());
        System.out.println("Categoria:"+p.classifica());
        in.close();
    }
}