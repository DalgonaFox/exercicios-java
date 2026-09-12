package br.edu.ifsp.aula3;
// Leia notas até que -1 seja informado. Exiba a média e quantas notas foram de aprovação.

import java.util.Scanner;

public class Sentinela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int quantidadeAprovado = 0;
        float soma = 0;
        float nota;

        System.out.println("Insira quantas notas quiser e obtenha uma média! Insira -1 para parar, ele não será contabilizado no cálculo.");

        do {
            System.out.print("Insira uma nota: ");
            nota = scanner.nextFloat();
            if(nota != -1) {
                quantidade++;
                soma += nota;
                if (nota >= 6) quantidadeAprovado++;
            }
        } while (nota != -1);

        float media = soma/quantidade;

        System.out.println("A média é de " + media);
        System.out.println("Foram lidas " + quantidadeAprovado + " notas com aprovação.");
    }
}
