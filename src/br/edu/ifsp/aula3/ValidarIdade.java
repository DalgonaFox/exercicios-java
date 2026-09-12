package br.edu.ifsp.aula3;
// Peça a idade do usuário repetidamente até que um valor entre 0 e 120 seja informado. Conte quantas tentativas foram necessárias.

import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int tentativas = 0;

        do {
            System.out.print("Insira a idade: ");
            idade = scanner.nextInt();
            tentativas++;
        } while (idade < 0 || idade > 120);

        if (tentativas == 1) System.out.println("Foi necessária " + tentativas + " tentativa.");
        else System.out.println("Foram necessárias " + tentativas + " tentativas.");
    }
}
