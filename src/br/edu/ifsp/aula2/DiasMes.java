package br.edu.ifsp.aula2;
// Dias do mês. Leia mês e ano e informe quantos dias tem esse mês, considerando anos bissextos
// (divisível por 4, exceto os divisíveis por 100 que não sejam por 400). Use switch como expressão.

import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o ano: ");
        int ano = scanner.nextInt();

        System.out.print("Insira o mês (em forma de número): ");
        int mes = scanner.nextInt();

        boolean bissexto = ano % 4 == 0;

        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 != 0) bissexto = false;
        }

        switch(mes) {
            case 1 -> System.out.println("Janeiro - 31 dias");
            case 2 -> {
                if (bissexto) System.out.println("Fevereiro - 29 dias");
                else System.out.println("Fevereiro - 28 dias");
            }
            case 3 -> System.out.println("Março - 31 dias");
            case 4 -> System.out.println("Abril - 30 dias");
            case 5 -> System.out.println("Maio - 31 dias");
            case 6 -> System.out.println("Junho - 30 dias");
            case 7 -> System.out.println("Julho - 31 dias");
            case 8 -> System.out.println("Agosto - 31 dias");
            case 9 -> System.out.println("Setembro - 30 dias");
            case 10 -> System.out.println("Outubro - 31 dias");
            case 11 -> System.out.println("Novembro - 30 dias");
            case 12 -> System.out.println("Dezembro - 31 dias");
        }
    }
}
