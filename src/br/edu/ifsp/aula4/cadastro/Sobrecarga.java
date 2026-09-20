package br.edu.ifsp.aula4.cadastro;
// Crie três versões de media — para dois, três e quatro valores — e verifique qual é chamada em cada caso.

import java.util.Scanner;

public class Sobrecarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        float media = 0;
        boolean valido = false;

        float[] notas = new float[4];

        do {
            System.out.print("Você quer inserir quantas notas, 2, 3 ou 4? ");
            quantidade = scanner.nextInt();
            if(quantidade <= 4 && quantidade >= 2) valido = true;
            else System.out.println("Valor inválido, insira novamente.");
        } while (!valido);

        switch(quantidade) {
            case 2 -> {
                for(int i = 0; i < 2; i++) {
                    System.out.print("Insira uma nota: ");
                    notas[i] = scanner.nextFloat();
                }
                media = calculaMedia(notas[0], notas[1]);
            }
            case 3 -> {
                for(int i = 0; i < 3; i++) {
                    System.out.print("Insira uma nota: ");
                    notas[i] = scanner.nextFloat();
                }
                media = calculaMedia(notas[0], notas[1], notas[2]);
            }
            case 4 -> {
                for(int i = 0; i < 4; i++) {
                    System.out.print("Insira uma nota: ");
                    notas[i] = scanner.nextFloat();
                }
                media = calculaMedia(notas[0], notas[1], notas[2], notas[3]);
            }
        }

        System.out.println(" ");
        System.out.println("A média é igual a " + media);
    }

    public static float calculaMedia(float n1, float n2) {
        return (n1 + n2) / 2;
    }

    public static float calculaMedia(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static float calculaMedia(float n1, float n2, float n3, float n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}
