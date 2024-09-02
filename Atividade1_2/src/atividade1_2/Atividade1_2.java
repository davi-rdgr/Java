package atividade1_2;

import java.util.Scanner;

public class Atividade1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do primeiro cliente? \n");
        String cliente1 = scanner.nextLine();

        System.out.println("Qual é a idade do primeiro cliente? \n");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        Object[] quartoA = new Object[2];
        if (idade1 >= 80) {
            quartoA[0] = cliente1 + " com desconto de 40%";
        } else {
            quartoA[0] = cliente1;
        }
        quartoA[1] = idade1;

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Qual é o nome do segundo cliente? \n");
            String cliente2 = scanner.nextLine();

            System.out.println("Qual é a idade do segundo cliente? \n");
            int idade2 = scanner.nextInt();
            scanner.nextLine();

            Object[] quartoB = new Object[2];

            if ((int) quartoA[1] >= idade2) {
                quartoB[0] = cliente2;
                quartoB[1] = idade2;
            } else {
                quartoB[0] = quartoA[0];
                quartoB[1] = quartoA[1];

                quartoA[1] = idade2;
                if (idade2 >= 80) {
                    quartoA[0] = cliente2 + " com desconto de 40%";
                } else {
                    quartoA[0] = cliente2;
                }
            }
            System.err.println("Quarto A: " + quartoA[0] + ", " + quartoA[1] + " anos! \n");
            System.err.println("Quarto B: " + quartoB[0] + ", " + quartoB[1] + " anos! \n");

            System.out.println("Deseja continuar cadastrando clientes? (S / N)\n");
            String resp = scanner.nextLine();
            continuar = resp;
        }
        scanner.close();
    }

}
