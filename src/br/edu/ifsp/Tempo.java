package br.edu.ifsp;
import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o tempo em segundos: ");
        int segundos = teclado.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosResto = (segundos % 3600) % 60;

        System.out.printf("Horas: %d%n", horas);
        System.out.printf("Minutos: %d%n", minutos);
        System.out.printf("Segundos: %d%n", segundosResto);
        teclado.close();
    }
}
