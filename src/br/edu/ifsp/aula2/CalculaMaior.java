package br.edu.ifsp.aula2;
// Maior de dois. Leia dois inteiros e informe qual é o maior, ou que são iguais. Resolva de duas formas:
// com if/else e com o ternário

import java.util.Scanner;

public class CalculaMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        int maior;
//        if(num1 < num2) maior = num2;
//        else maior = num1;

        // ou
        maior = (num1 <num2) ? num2 : num1;

        System.out.println("O maior número é o " + maior);
    }
}
