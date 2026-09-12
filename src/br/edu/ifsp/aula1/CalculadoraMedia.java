package br.edu.ifsp.aula1;
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Nota 1: ");
        double n1 = teclado.nextDouble();
        System.out.println("Nota 2: ");
        double n2 = teclado.nextDouble();

        double media = (n1 + n2) / 2.0; // evita divisao inteira

        System.out.printf("Aluno: %s%n", nome);
        System.out.printf("Media: %.2f%n", media);
        teclado.close();
    }
}
