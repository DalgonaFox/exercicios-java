package br.edu.ifsp.aula3;
// Leia 10 números e exiba a soma, a média, o maior e o menor valor informado.

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float soma = 0;
        float maior = Integer.MIN_VALUE;
        float menor = Integer.MAX_VALUE;
        float numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o número " + i + ": ");
            numero = scanner.nextFloat();

            soma += numero;

            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        float media = soma / 10;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
