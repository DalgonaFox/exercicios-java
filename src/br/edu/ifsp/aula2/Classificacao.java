package br.edu.ifsp.aula2;
// Classificação por faixa. Leia a média e informe o conceito: A (≥ 9), B (≥ 7), C (≥ 6), D (abaixo de 6).
// Use cadeia else if e confira a ordem das condições.

import java.util.Scanner;

public class Classificacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a média: ");
        float media = scanner.nextFloat();

        String conceito;
        //conceito = (media >= 9) ? "A" : (media >= 7) ? "B" : (media >= 6) ? "C" : "D";

        // ou

        if (media >= 9) conceito = "A";
        else if (media >= 7) conceito = "B";
        else if (media >= 6) conceito = "C";
        else conceito = "D";

        System.out.println("Conceito: " + conceito);
    }
}
