package sec9.pkg2;

import entities.ContaBancaria;
import java.util.Locale;
import java.util.Scanner;

public class Sec92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual e o numero da conta ?");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual e o nome do dono da conta? ");
        String nome = sc.nextLine();

        ContaBancaria conta;

        System.out.println("Deseja inicialziar com um deposito? (S / N)");
        char response = sc.next().charAt(0);
        if (response == 'S') {
            System.out.println("Valor do deposito: ");
            double deposito = sc.nextDouble();
            conta = new ContaBancaria(numeroConta, nome, deposito);
        } else {
            conta = new ContaBancaria(numeroConta, nome);

        }

        System.out.println(conta.toString());

        System.out.println("Adicione um valor: ");
        double valorAdicional = sc.nextDouble();
        conta.gerarDeposito(valorAdicional);
        System.out.println(conta.toString());

        System.out.println("Extraia um valor: ");
        double valorRemover = sc.nextDouble();
        conta.sacarDeposito(valorRemover);
        System.out.println(conta.toString());

    }

}
