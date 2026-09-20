package br.edu.ifsp.aula4;
// Tome o programa de notas do encontro 4 e divida-o em pelo menos quatro métodos, deixando o main com menos de quinze linhas.

import java.util.Scanner;

public class Extracao {

    static int quantidade = 0;
    static int quantidadeAprovado = 0;
    static float soma = 0;
    static float media = 0;

    public static void main(String[] args) {
        System.out.println("Insira quantas notas quiser e obtenha uma média! Insira -1 para parar, ele não será contabilizado no cálculo.");
        inserirNotas();
        printResultado(media, quantidadeAprovado);
    }

    public static float calcularMedia() {
        return soma/quantidade;
    }

    public static void inserirNotas() {
        Scanner scanner = new Scanner(System.in);
        float nota;
        do {
            nota = escanearNota(scanner);
            if(nota != -1) {
                quantidade++;
                soma += nota;
                if (nota >= 6) quantidadeAprovado++;
            }
        } while (nota != -1);

        media = calcularMedia();
    }

    public static float escanearNota(Scanner scanner) {
        System.out.print("Insira uma nota: ");
        return scanner.nextFloat();
    }

    public static void printResultado(float media, int quantidadeAprovado) {
        System.out.println("A média é de " + media);
        System.out.println("Foram lidas " + quantidadeAprovado + " notas com aprovação.");
    }
}
