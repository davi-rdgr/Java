package atividade1_4;

import java.util.Scanner;

public class Atividade1_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int i = 0;
        String[] nomes = new String[15];

        do {
            System.out.println("///-------------------------------------///");
            System.out.println("Digite:");
            System.out.println("\n 1 - Cadastrar \n 2 - Pesquisar \n 3 - Sair \n");
            System.out.println("///-------------------------------------///");

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if (i >= 15) {
                        System.out.println("Máximo de cadastros efetuados (15)");
                        break;
                    } else {
                        System.out.println("Qual será o nome do hóspede?");
                        String nome = scanner.nextLine();
                        nomes[i] = nome;
                        i++;
                    }
                    break;

                case 2:
                    System.out.println("Por qual hóspede deseja pesquisar? ");
                    String pesquisa = scanner.nextLine();
                    boolean encontrado = false;
                    for (int b = 0; b < i; b++) {
                        if (nomes[b].equalsIgnoreCase(pesquisa)) {
                            System.out.println("Hospede " + nomes[b] + " se encontra no índice " + b);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Hospede não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Fim da execução!");
                    break;

                default:
                    System.out.println("Escolha inválida!");
                    break;
            }

        } while (opcao != 3);
        for (int j = 0; j < i; j++) {
            System.out.println("Hóspede " + j + ": " + nomes[j]);

        }
        scanner.close();
    }
}
