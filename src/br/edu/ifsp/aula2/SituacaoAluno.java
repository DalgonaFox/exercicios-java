package br.edu.ifsp.aula2;
// Situação do aluno. Leia duas notas e a frequência. Aprovado exige média ≥ 6,0 e frequência ≥ 75%.
// Informe também o motivo da reprovação.

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Insira a frequência em porcentagem do aluno: ");
        float frequencia = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 6 && frequencia >= 75) {
            System.out.println("Aprovado!");
        } else if (media < 6) {
            System.out.println("Você foi reprovado por ter uma média de " + media + ", que é menor que 6.");
        } else {
            System.out.println("Você foi reprovado por ter uma frequência menor que 75%.");
        }
    }
}
