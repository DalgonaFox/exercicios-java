package br.edu.ifsp.aula3;
// Exiba os números de 1 a 50, dez por linha. Depois exiba de 50 a 1, em ordem decrescente.

public class Contagem {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if (i % 10 == 0) System.out.println(i);
            else System.out.print(i + ", ");
        }
    }
}
