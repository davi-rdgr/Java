package atv3;

import entities.Assalariado;
import entities.Funcionario;
import entities.Horista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATV3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> assalariados = new ArrayList<>();
        List<Funcionario> horistas = new ArrayList<>();

        int qntFuncionarios = 10;

        for (int i = 0; i < qntFuncionarios; i++) {
            int tipo;
            do {
                System.out.println("Funcionario " + (i + 1));
                System.out.println("\n 1 - Assalariado \n 2 - Horista");
                tipo = sc.nextInt();
                sc.nextLine();
                System.out.print("Nome do funcionario " + (i + 1) + ": ");
                String nome = sc.nextLine();
                System.out.print("CPF do funcionario " + (i + 1) + ": ");
                String cpf = sc.nextLine();
                System.out.print("Endereço do funcionario " + (i + 1) + ": ");
                String endereco = sc.nextLine();
                System.out.print("Telefone do funcionario " + (i + 1) + ": ");
                String telefone = sc.nextLine();
                System.out.print("Setor do funcionario " + (i + 1) + ": ");
                String setor = sc.nextLine();

                if (tipo != 1 && tipo != 2) {
                    System.out.println("Insira um tipo valido para o funcionario " + (i + 1) + "\n \n");
                    break;
                }

                if (tipo == 1) {
                    System.out.println("Insira o salario: ");
                    double salario = sc.nextDouble();
                    Funcionario assalariado = new Assalariado(nome, cpf, endereco, telefone, setor, salario);
                    assalariados.add(assalariado);
                } else if (tipo == 2) {
                    System.out.println("Insira as horas trabalhadas: ");
                    int horasTrabalhadas = sc.nextInt();
                    System.out.println("Insira o valor da hora trabalhada: ");
                    double valorHora = sc.nextDouble();
                    Funcionario horista = new Horista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora);
                    horistas.add(horista);
                }
            } while (tipo != 1 && tipo != 2);

        }

        int menuContinuar;
        do {
            System.out.println(" Escolha uma opção para visualizar as informaçoes: \n");
            System.out.println(" 1 - Visualizar funcionarios Assalariados \n");
            System.out.println(" 2 - Visualizar funcionarios Horistas \n");
            System.out.println(" 3 - Aplicar aumento baseado em porcentagem \n");
            System.out.println(" 4 - Sair \n");

            menuContinuar = sc.nextInt();

            switch (menuContinuar) {

                case 1 -> {
                    System.out.println("\n Funcionarios Assalariados: \n");
                    for (Funcionario f : assalariados) {
                        f.mostrarDadosFuncionario();
                        double salario = f.calcularSalario();
                        System.out.println("Salario: " + salario + "\n");
                    }
                    break;
                }

                case 2 -> {

                    System.out.println("\n");
                    System.out.println("\n Funcionarios Horistas: \n");
                    for (Funcionario f : horistas) {
                        f.mostrarDadosFuncionario();
                        double salario = f.calcularSalario();
                        System.out.println("Salario: " + salario + "\n \n");
                    }
                    break;
                }

                case 3 -> {

                    System.out.println("Insira a porcentagem do aumento: \n");
                    double percentual = sc.nextDouble();

                    for (Funcionario f : assalariados) {
                        f.aplicarAumento(percentual);
                    }

                    for (Funcionario f : horistas) {
                        f.aplicarAumento(percentual);
                    }
                    System.out.println("Os salarios foram atualizados ");
                    break;
                }

                case 4 -> {

                    System.out.println("Fim de execução!");
                    break;
                }
                default -> {
                    System.out.println("Opçao invalida!");
                    break;
                }
            }

        } while (menuContinuar != 4);
    }

}
