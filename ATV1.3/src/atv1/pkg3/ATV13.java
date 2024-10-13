package atv1.pkg3;

import java.util.Scanner;

public class ATV13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o valor da diária: ");
        int valorDiaria = sc.nextInt();
        sc.nextLine();  
        String opcao = "continuar";
        int totalGratuito = 0;
        int totalMeia = 0;
        int valorTotalHospedagem = 0;
        do {
            System.out.print("Qual o nome do hóspede a ser cadastrado? ");
            String nomeHospede = sc.nextLine();

            System.out.printf("Qual é a idade do(a) %s? ", nomeHospede);
            int idadeHospede = sc.nextInt();

            if (idadeHospede < 4) {
                totalGratuito++;
            } else if (idadeHospede > 80) {
                valorTotalHospedagem += valorDiaria / 2;
                totalMeia++;
            } else {
                valorTotalHospedagem += valorDiaria;
            }

            sc.nextLine(); 
            System.out.print("Deseja continuar cadastrando? PARE para finalizar");
            opcao = sc.nextLine();
        } while (!opcao.equalsIgnoreCase("PARE"));
        
        System.out.println("Total de hospedagens: R$" + valorTotalHospedagem + "; " + totalGratuito + " gratuidade(s); " + totalMeia + " meia(s)\n");
        sc.close();
    }

}
