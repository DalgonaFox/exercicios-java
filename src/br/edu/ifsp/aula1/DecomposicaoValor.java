package br.edu.ifsp.aula1;
import java.util.Scanner;

public class DecomposicaoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número INTEIRO de 3 dígitos: ");
        int numInt = teclado.nextInt();

        int unidade = numInt % 10;
        int dezena = (numInt % 100) - unidade;
        int centena = numInt - (dezena + unidade);

        System.out.println("Centena = " + centena);
        System.out.println("Dezena = " + dezena);
        System.out.println("Unidade = " + unidade);
        teclado.close();
    }
}
