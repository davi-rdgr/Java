package atv1.pkg4;

import java.util.Scanner;

public class ATV14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];
        int menu;
        int i = 0;
        do {
            System.out.println("Digite:\n 1 - Cadastrar \n 2 - Pesquisar \n 3 - Sair");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    if (i < 15) {
                        System.out.print("Qual será o nome do hóspede? ");
                        nomes[i++] = sc.nextLine();
                    } else {
                        System.out.println("Máximo de 15 cadastros efetuados");
                    }
                    break;
                case 2:
                    System.out.print("Qual hóspede deseja pesquisar? ");
                    String pesquisa = sc.nextLine();
                    boolean encontrado = false;

                    for (int j = 0; j < i; j++) {
                        if (nomes[j].equalsIgnoreCase(pesquisa)) {
                            System.out.println("Hóspede " + nomes[j] + " está no índice " + j);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Hóspede não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Fim da execução!");
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }
        } while (menu != 3);

        for (int j = 0; j < i; j++) {
            System.out.println("Hóspede " + j + ": " + nomes[j]);
        }
        sc.close();
    }
}
