package atv1.pkg2;

import java.util.Scanner;

public class ATV12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do primeiro cliente? \n");
        String primeirocliente = sc.nextLine();

        System.out.println("Insira a idade do primeiro cliente? \n");
        int primeiraidade = sc.nextInt();

        sc.nextLine();

        Object[] quartoA = new Object[2];
        if (primeiraidade >= 80) {
            quartoA[0] = primeirocliente + " com desconto de 40%";
        } else {
            quartoA[0] = primeirocliente;
        }
        quartoA[1] = primeiraidade;

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Insira o nome do segundo cliente? \n");
            String cliente2 = sc.nextLine();

            System.out.println("Insira a idade do segundo cliente? \n");
            int idade2 = sc.nextInt();
            sc.nextLine();

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

            System.out.println("Deseja continuar cadastrando clientes? S  N\n");
            String resposta = sc.nextLine();
            continuar = resposta;
        }
        sc.close();
    }
}
