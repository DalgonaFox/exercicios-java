package br.edu.ifsp;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = teclado.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = teclado.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;

        System.out.printf("Média: %.2f%n", media);
        teclado.close();
    }
}
