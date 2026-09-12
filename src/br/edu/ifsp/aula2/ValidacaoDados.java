package br.edu.ifsp.aula2;
// Validação de dados. Leia idade, nota e um código de turno (M, V ou N) e informe, para cada campo, se o
// valor está na faixa aceitável

import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        int idade;
        float nota;
        String codigoTurno;

        do {
            System.out.print("Insira a idade: ");
            idade = scanner.nextInt();

            if (idade < 18 || idade > 100) System.out.println("Insira uma idade válida.");
            else valido = true;
        } while (!valido);

        valido = false;

        do {
            System.out.print("Insira a nota: ");
            nota = scanner.nextFloat();

            if (nota < 0 || nota > 10) System.out.println("Insira uma nota válida.");
            else valido = true;
        } while (!valido);

        valido = false;

        scanner.nextLine();

        do {
            System.out.print("Insira o código de turno: ");
            codigoTurno = scanner.nextLine().strip().toUpperCase();

            if (codigoTurno.equals("M") || codigoTurno.equals("V") || codigoTurno.equals("N")) valido = true;
            else System.out.println("Insira um código de turno válido.");
        } while (!valido);

        System.out.println(" ");

        System.out.println("-- Dados validados --");
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Turno: " + codigoTurno);

    }
}
