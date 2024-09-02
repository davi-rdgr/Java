package atividade1_1;

import java.util.Scanner;

public class Atividade1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda a seguinte pergunta para que possamos saber qual auditório é o mais adequado para o evento! \n");
        System.out.println("Quantos convidados haverão no eventos? \n");

        int convidados = scanner.nextInt();

        if (convidados < 0 || convidados > 350) {
            System.out.println("Número de convidados inválido!");
        } else if (convidados > 0 || convidados <= 250) {
            System.out.println("Use o auditório Alfa!");
        } else if (convidados > 150 || convidados <= 250) {
            System.out.println("Use o auditório Alfa e inclua mais " + (convidados - 150) + " cadeiras!");
        } else {
            System.out.println("Use o auditório Beta!");
        }
        scanner.close();
    }

}
