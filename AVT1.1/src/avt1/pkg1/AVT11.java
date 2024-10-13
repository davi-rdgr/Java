package avt1.pkg1;

import java.util.Scanner;

public class AVT11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Haverão quantos convidados? \n");
        int convidados = sc.nextInt();
        if (convidados < 0 || convidados > 350) {
            System.out.println("Convidados inválido!");
        } else if (convidados > 0 || convidados <= 250) {
            System.out.println("Auditório Alfa!");
        } else if (convidados > 150 || convidados <= 250) {
            System.out.println("Auditório Alfa com mais " + (convidados - 150) + " cadeiras! \n");
        } else {
            System.out.println("Auditório Beta! \n");
        }
        sc.close();
    }

}
