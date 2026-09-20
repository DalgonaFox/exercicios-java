package br.edu.ifsp.aula4;
// Escreva lerNotaValida(Scanner), que repete a leitura até obter um valor entre 0 e 10 e devolve a nota válida.

import java.util.Scanner;

public class ValidacaoReutilizavel {
    public float lerNotaValida(Scanner scanner) {
        boolean valido = false;
        float nota = 0;
        do {
            System.out.print("Insira uma nota entre 0 e 10: ");
            nota = scanner.nextFloat();
            if(nota <= 10 && nota >= 0) {
                valido = true;
            } else {
                System.out.println("Valor incorreto. Realize a operação novamente.");
            }
        } while (!valido);

        return nota;
    }
}
