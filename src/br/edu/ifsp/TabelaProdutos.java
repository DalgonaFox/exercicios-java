package br.edu.ifsp;
import java.math.BigDecimal;
import java.util.Scanner;

public class TabelaProdutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nomesProd = new String[3];
        int[] quantProd = new int[3];
        float[] precoProd = new float[3];
        float[] precoTotalProd = new float[3];
        float precoTotal = 0;

        for(int i = 0; i < 3; i++) {
            System.out.println("Produto " + (i+1));
            System.out.print("Nome do produto: ");
            String nome = teclado.nextLine();
            nomesProd[i] = nome;

            System.out.print("Quantidade: ");
            int quantidade = teclado.nextInt();
            quantProd[i] = quantidade;


            System.out.print("Preço: ");
            float preco = teclado.nextFloat();
            precoProd[i] = preco;

            System.out.println("");
            teclado.nextLine();

            precoTotalProd[i] = quantidade * preco;
            precoTotal += precoTotalProd[i];
        }

        System.out.println("|----------------------------------TABELA---------------------------------------|");
        System.out.printf("|%-12s | %-15s | %-15s | %12s | %12s | %n", "Produto", "Nome", "Quantidade", "Preço", "Total");
        System.out.println("|-------------|-----------------|-----------------|--------------|--------------|");

        for(int i = 0; i < 3; i++) {
            System.out.printf("|%-12d | %-15s | %-15d | %12.2f | %12.2f |%n", (i+1), nomesProd[i], quantProd[i], precoProd[i], precoTotalProd[i]);
            System.out.println("|-------------|-----------------|-----------------|--------------|--------------|");
        }

        System.out.printf("|%-63s | %12.2f |%n", "Total", precoTotal);
        System.out.println("|-------------------------------------------------------------------------------|");


        teclado.close();
    }
}
