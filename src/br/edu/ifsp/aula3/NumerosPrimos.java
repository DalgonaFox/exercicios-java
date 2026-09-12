package br.edu.ifsp.aula3;
// Leia um inteiro e informe se é primo, usando um laço e break ao encontrar o primeiro divisor.

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Insira um número inteiro: ");
        numero = scanner.nextInt();

        int i = 2;
        int primeiroDivisor = 0;
        boolean isDivisivel = false;

        while(!isDivisivel) {
            isDivisivel = numero % i == 0;
            primeiroDivisor = i;
            i++;
        }

        boolean isPrimo = primeiroDivisor == numero;

        if(isPrimo) System.out.println("O número " + numero + " é primo.");
        else System.out.println("O número " + numero + " NÃO é primo.");

    }
}
