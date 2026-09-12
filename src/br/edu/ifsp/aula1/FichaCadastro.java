package br.edu.ifsp.aula1;
import java.util.Scanner;

public class FichaCadastro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Idade: ");
        int idade = teclado.nextInt();
        System.out.print("Altura (inserir com vírgula): ");
        float altura = teclado.nextFloat();

        System.out.println("---------Aluno---------");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Altura: %.2fcm", altura);
        teclado.close();
    }
}
