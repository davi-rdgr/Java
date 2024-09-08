package sec10.pkg8;

import entities.Funcionarios;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sec108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionarios> listaFunc = new ArrayList<>();

        System.out.println("Insira um número N: ");
        int N = sc.nextInt();
        sc.nextLine();

        int id = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Insira o nome do funcionário: ");
            String name = sc.nextLine();
            System.out.println("Insira o salário do funcionário:");
            double salario = sc.nextDouble();
            sc.nextLine();

            Funcionarios func = new Funcionarios(id, name, salario);
            listaFunc.add(func);

            System.out.println("Funcionários cadastrados: ");
            for (Funcionarios funcc : listaFunc) {
                System.out.println(funcc);
            }
            id++;
        }

        for (Funcionarios funcc : listaFunc) {
            System.out.println("Adicione um aumento em porcentagem para " + funcc.getName());
            double porcentagem = sc.nextDouble();
            funcc.aplicarAumento(porcentagem);
        }

        for (Funcionarios funcc : listaFunc) {
            System.out.println(funcc);
        }

        //for(int i = 0; i < listaFunc.size(); i++) 
        sc.close();
    }

}
