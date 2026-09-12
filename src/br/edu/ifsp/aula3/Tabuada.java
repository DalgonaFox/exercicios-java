package br.edu.ifsp.aula3;
// Exiba a tabuada de 1 a 10 em formato de tabela alinhada, usando laços aninhados e printf.

public class Tabuada {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println("-----------------");
            System.out.println("Tabuada do " + i);
            System.out.println("-----------------");
            for(int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + (j*i));
            }
            System.out.println(" ");
        }
    }
}
