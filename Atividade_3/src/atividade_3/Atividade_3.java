package atividade_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_3 {

    public static abstract class Funcionario {

        private final String nome;
        private final String cpf;
        private final String endereco;
        private final String telefone;
        private final String setor;

        // Construtor: 
        public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.telefone = telefone;
            this.setor = setor;
        }

        // Function para retornar as informações básicas de cada Funcionário:
        public void mostrarDadosFuncionario() {
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Endereço " + endereco);
            System.out.println("Telefone: " + telefone);
            System.out.println("Setor: " + setor);
        }

        public abstract double calcularSalario();

        public abstract double aplicarAumento(double percentual);
    }

    public static class Assalariado extends Funcionario {

        private double salario;

        // Construtor:
        public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salario) {
            super(nome, cpf, endereco, telefone, setor);
            this.salario = salario;
        }

        // Function para retornar o salário de determinado Funcionário Assalariado:
        @Override
        public double calcularSalario() {
            return salario;
        }

        // Function para retornar o salário com aumento percentual de determinado Funcionário Assalariado:
        @Override
        public double aplicarAumento(double percentual) {
            return salario += salario * (percentual / 100);
        }
    }

    public static class Horista extends Funcionario {

        private final double horasTrabalhadas;
        private double valorHora;

        // Construtor:
        public Horista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorHora) {
            super(nome, cpf, endereco, telefone, setor);
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorHora = valorHora;
        }

        // Function para retornar salário de determinado Funcionários Horistas:
        @Override
        public double calcularSalario() {
            return horasTrabalhadas * valorHora;
        }

        // Function para retornar o salário com aumento percentual de determinado Funcionário Horista:
        @Override
        public double aplicarAumento(double percentual) {
            return valorHora += valorHora * (percentual / 100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o Array para armazenar os funcionários:
        List<Funcionario> assalariados = new ArrayList<>();
        List<Funcionario> horistas = new ArrayList<>();

        int quantidadeFuncionarios = 10;

        // O loop que dará início ao processo de cadastro de cada funcionário:
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            int tipo;
            do {
                System.out.println("Insira dados do funcionario n° " + (i + 1));
                System.out.println("Tipo de funcionario: 1 - Assalariado // 2 - Horista");
                tipo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome do funcionario " + (i + 1) + ": ");
                String nome = scanner.nextLine();
                System.out.print("CPF do funcionario " + (i + 1) + ": ");
                String cpf = scanner.nextLine();
                System.out.print("Endereço do funcionario " + (i + 1) + ": ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone do funcionario " + (i + 1) + ": ");
                String telefone = scanner.nextLine();
                System.out.print("Setor do funcionario " + (i + 1) + ": ");
                String setor = scanner.nextLine();

                // Tratamento básico para que só possa ser escolhido 1 - Assalariados ou 2 - Horistas:
                if (tipo != 1 && tipo != 2) {
                    System.out.println("Insira um tipo valido para o funcionario " + (i + 1) + "\n \n");
                    break;
                }

                // Criando os Objetos e guardando os trabalhadores no Array:
                if (tipo == 1) {
                    System.out.println("Insira o salario: ");
                    double salario = scanner.nextDouble();
                    Funcionario assalariado = new Assalariado(nome, cpf, endereco, telefone, setor, salario);
                    assalariados.add(assalariado);
                } else if (tipo == 2) {
                    System.out.println("Insira as horas trabalhadas: ");
                    int horasTrabalhadas = scanner.nextInt();
                    System.out.println("Insira o valor da hora trabalhada: ");
                    double valorHora = scanner.nextDouble();
                    Funcionario horista = new Horista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora);
                    horistas.add(horista);
                }
            } while (tipo != 1 && tipo != 2);

        }
        
        int menuContinuar;
        do {
            System.out.println(" ------------------------------------------------------- \n");
            System.out.println(" Escolha uma opção para visualizar as informaçoes: \n");
            System.out.println(" 1 - Visualizar funcionarios Assalariados \n");
            System.out.println(" 2 - Visualizar funcionarios Horistas \n");
            System.out.println(" 3 - Aplicar aumento baseado em porcentagem \n");
            System.out.println(" 4 - Sair \n");
            System.out.println(" ------------------------------------------------------- \n");

            menuContinuar = scanner.nextInt();

            switch (menuContinuar) {

                case 1 -> {
                    // For each para mostrar as informações dos assalariados cadastrados:
                    System.out.println("\n \n Informaçoes dos funcionarios cadastrados: \n");
                    System.out.println("\n Funcionarios Assalariados: \n");
                    for (Funcionario f : assalariados) {
                        f.mostrarDadosFuncionario();
                        double salario = f.calcularSalario();
                        System.out.println("Salario: " + salario + "\n");
                    }
                    break;
                }

                case 2 -> {
                    // For each para mostrar as informações dos horistas cadastrados:
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
                    // Aplicando o valor da porcentagem baseada nos salários:
                    System.out.println("Insira a porcentagem do aumento a ser aplicada: \n");
                    double percentual = scanner.nextDouble();

                    for (Funcionario f : assalariados) {
                        f.aplicarAumento(percentual);
                    }

                    for (Funcionario f : horistas) {
                        f.aplicarAumento(percentual);
                    }
                    System.out.println("Os salarios foram atualizados referentes a porcentagem! ");
                    break;
                }

                case 4 -> {
                    // Auto explicativo:
                    System.out.println("Volte sempre! :)");
                    break;
                }
                default -> {
                    System.out.println("Opçao invalida! Tente novamente.");
                    break;
                }
            }
            // Lógica para manter o funcionamento de um menu de visualização:
        } while (menuContinuar != 4);
    }

}
