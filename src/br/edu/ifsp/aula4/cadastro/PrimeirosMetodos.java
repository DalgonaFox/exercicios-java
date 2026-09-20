package br.edu.ifsp.aula4.cadastro;
// Escreva calcularMedia, maiorDeTres e ehPar, cada um com parâmetros e retorno adequados. Teste todos a partir do main.

import java.util.Scanner;

public class PrimeirosMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira três números: ");

        System.out.print("Primeiro número: ");
        float n1 = scanner.nextFloat();

        System.out.print("Segundo número: ");
        float n2 = scanner.nextFloat();

        System.out.print("Primeiro número: ");
        float n3 = scanner.nextFloat();

        System.out.println(" ");

        float media = calcularMedia(n1, n2, n3);
        System.out.println("A média é de " + media);
        float maior = maiorDeTres(n1, n2, n3);
        System.out.println("O maior número é o " + maior);

        System.out.println(" ");

        System.out.println("Sobre os três números: ");
        System.out.println("O número " + n1 + " é " + ehPar(n1));
        System.out.println("O número " + n2 + " é " + ehPar(n2));
        System.out.println("O número " + n3 + " é " + ehPar(n3));
    }

    public static float calcularMedia(float n1, float n2, float n3) {
        float media = (n1 + n2 + n3)/3;
        return media;
    }

    public static float maiorDeTres(float n1, float n2, float n3) {
        float maior = Integer.MIN_VALUE;
        float numeros[] = new float[3];
        numeros[0] = n1;
        numeros[1] = n2;
        numeros[2] = n3;

        for (int i = 0; i <3; i++) {
            if(numeros[i] > maior) maior = numeros[i];
        }

        return maior;
    }

    public static String ehPar(float numero) {
        if(numero % 2 == 0) return "par.";
        return "ímpar.";
    }
}
