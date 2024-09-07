package sec10.pkg5;

import java.util.Locale;
import java.util.Scanner;

public class Sec105 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] quartos = new String[9];
        String[] nome = new String[9];
        String[] email = new String[9];

        for (int i = 0; i < quartos.length; i++) {
            quartos[i] = "Vazio";
        }
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Qual quarto deseja alugar?");
            int nquarto = sc.nextInt();

            sc.nextLine();
            System.out.println("Qual seu nome?");
            String nnome = sc.nextLine();
            System.out.println("Qual seu email estudantil?");
            String nemail = sc.nextLine();

            if (quartos[nquarto].equalsIgnoreCase("Vazio")) {
                quartos[nquarto] = "Ocupado";
                nome[nquarto] = nnome;
                email[nquarto] = nemail;
            } else {
                System.out.println("Quarto já ocupado!");
            }

            System.out.println("Deseja continuar ? (S / N)");
            continuar = sc.nextLine();
        }

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i].equals("Ocupado")) {
                System.out.println("\n Quarto " + i + " ocupado por " + nome[i] + ", com email " + email[i]);
            }
        }
    }

}
