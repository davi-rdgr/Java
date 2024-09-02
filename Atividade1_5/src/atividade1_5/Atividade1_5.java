package atividade1_5;

import java.util.Scanner;

public class Atividade1_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean[][] quartos = new boolean[4][3];
        String continuar = "S";

        do {
            System.out.println("Informe o andar (1-4): ");
            int andar = scanner.nextInt();
            System.out.println("Informe o número do quarto (1-3): ");
            int quarto = scanner.nextInt();

            if (andar >= 1 && andar <= 4 && quarto >= 1 && quarto <= 3) {
                quartos[andar - 1][quarto - 1] = true; 
            } else {
                System.out.println("Andar ou número de quarto inválido!");
            }

            System.out.println("Deseja informar outra ocupação? (S/N)");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        for (int i = 3; i >= 0; i--) { 
            System.out.println((i + 1) + "º andar:");
            for (int j = 0; j < 3; j++) {
                String status;
                if (quartos[i][j]) {
                    status = "ocupado";
                } else {
                    status = "desocupado";
                }
                System.out.println("- Quarto " + (j + 1) + " " + status);
            }
            System.out.println();
        }
    }
}
