package atividade1_3;

import java.util.Scanner;

public class Atividade1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual deverá ser o valor da diária? \n");
        int diaria = scanner.nextInt();
        scanner.nextLine();

        String continuar = "continuar";
        int gratuidade = 0;
        int meia = 0;
        int total = 0;

        do {
            System.out.println("Qual o nome do hóspede a ser cadastrado? \n");
            String hospede = scanner.nextLine();

            System.out.println("Qual é a idade do(a) " + hospede + "? \n");
            int idade = scanner.nextInt();

            if (idade < 4) {
                gratuidade++;
            } else if (idade > 80) {
                total = diaria / 2;
                meia++;
            } else {
                total = total + diaria;
            }
            scanner.nextLine();
            System.out.println("Deseja continuar cadastrando? (para não: PARE) \n");

            String resp = scanner.nextLine();
            continuar = resp;
        } while (!continuar.equalsIgnoreCase("PARE"));
        System.out.println("Total de hospedagens: R$" + total + "; " + gratuidade + " gratuidade(s); " + meia + " meia(s)\n");
        scanner.close();
    }

}
