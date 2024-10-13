package sec13.pkg6;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sec136 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.println("Numero de contribuintes: ");
        int cont = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < cont; i++) {
            System.out.println("Contribuinte #" + (i + 1));
            System.out.println("Pessoa física ou jurídica? (f / j) ");

            String tipo = sc.nextLine();

            if (tipo.equals("f")) {
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.println("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();

                PessoaFisica pessoaficia = new PessoaFisica(nome, renda, gastosSaude);
                list.add(pessoaficia);
            } else {
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.println("Numero de funcionários: ");
                int funcionarios = sc.nextInt();

                PessoaJuridica pessoajuridica = new PessoaJuridica(nome, renda, funcionarios);
                list.add(pessoajuridica);
            }
        }
        
        for (Contribuinte contribuinte: list) {
            System.out.println(contribuinte.impostosPagos());
        }
        
    }

}
