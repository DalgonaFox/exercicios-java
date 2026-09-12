package br.edu.ifsp.aula2;
// Menu de operações. Leia dois números e uma opção (1 a 4) para somar, subtrair, multiplicar ou dividir.
// Use switch e trate a divisão por zero.

import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao;
        boolean continuar;
        float num1;
        float num2;

        do {
            System.out.println(" ");

            System.out.println("Menu de Operações");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Selecione a sua operação: ");
            operacao = scanner.nextInt();

            System.out.println(" ");

            switch (operacao) {
                case 1 -> {
                    num1 = coletarNumero(scanner);
                    num2 = coletarNumero(scanner);
                    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                }
                case 2 -> {
                    num1 = coletarNumero(scanner);
                    num2 = coletarNumero(scanner);
                    System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                }
                case 3 -> {
                    num1 = coletarNumero(scanner);
                    num2 = coletarNumero(scanner);
                    System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                }
                case 4 -> {
                    num1 = coletarNumero(scanner);
                    num2 = coletarNumero(scanner);
                    if (num2 == 0) {
                        System.out.println("Você não pode fazer uma divisão por zero.");
                        break;
                    }
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
                default -> System.out.println("Opção inválida.");
            }

            System.out.println(" ");
            scanner.nextLine();

            System.out.print("Deseja calcular novamente?(S/N): ");
            String opcao = scanner.nextLine();

            continuar = opcao.strip().toUpperCase().equals("S");

        } while (continuar);
    }

    static float coletarNumero(Scanner scanner) {
        System.out.print("Insira um número: ");
        return scanner.nextFloat();
    }
}
