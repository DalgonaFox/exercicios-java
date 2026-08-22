package br.edu.ifsp;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Temperatura em Celcius: ");
        float tempCelcius = teclado.nextFloat();

        float tempFahre = tempCelcius * ((float) 9 /5) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.2f%n", tempFahre);
        teclado.close();
    }
}
