package br.edu.ifsp.aula3;
// Implemente um menu em do-while com quatro opções, tratando a opção inválida e encerrando apenas na opção 0.

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class MenuCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean isSair;

        do {
            System.out.println("Menu");
            System.out.println("0 - Sair");
            System.out.println("1 - Que dia do mês é hoje?");
            System.out.println("2 - Que dia da semana é hoje?");
            System.out.println("3 - Em que fuso horário estamos?");
            System.out.println("4 - Que horas são?");
            System.out.print("Selecione a opção que deseja: ");
            opcao = scanner.nextInt();

            isSair = opcao == 0;

            System.out.println(" ");

            if(!isSair) {
                switch(opcao) {
                    case 1 -> System.out.println("Hoje é dia " + LocalDate.now().getDayOfMonth());
                    case 2 -> {
                        String diaSemana = String.valueOf(LocalDate.now().getDayOfWeek()).toLowerCase();
                        System.out.println("Hoje é " + diaSemana);
                    }
                    case 3 -> System.out.println("Estamos no fuso horário \"" + TimeZone.getDefault().getID() + "\".");
                    case 4 -> {
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
                        System.out.println("Agora são " + LocalTime.now().format(formatador));
                    }
                    default -> System.out.println("Opção incorreta, tente novamente.");
                }
            }

            System.out.println(" ");

        } while (opcao != 0);

    }
}
