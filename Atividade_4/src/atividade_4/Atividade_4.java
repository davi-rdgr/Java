package atividade_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_4 {

    public static interface Imposto {

        double calcularImposto();

        String getDescricao();
    }

    public static class PIS implements Imposto {

        private double debito;
        private double credito;

        // construtor 
        public PIS(double debito, double credito) {
            this.debito = debito;
            this.credito = credito;
        }

        // calcula o imposto PIS baseado na diferença entre débito e crédito multiplicada pela alíquota
        @Override
        public double calcularImposto() {
            return (debito - credito) * 0.0165;
        }

        // retorna a descrição do imposto
        @Override
        public String getDescricao() {
            return "PIS";
        }
    }

    public static class IPI implements Imposto {

        private double valorProduto;
        private double frete;
        private double seguro;
        private double outrasDespesas;
        private double aliquota;

        // construtor
        public IPI(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota) {
            this.valorProduto = valorProduto;
            this.frete = frete;
            this.seguro = seguro;
            this.outrasDespesas = outrasDespesas;
            this.aliquota = aliquota;
        }

        // calcula o imposto IPI baseado na soma do valor do produto, frete, seguro e outras despesas, multiplicada pela aliquota
        @Override
        public double calcularImposto() {
            double baseCalculo = valorProduto + frete + seguro + outrasDespesas;
            return baseCalculo * (aliquota / 100);
        }

        // retorna a descrição do imposto
        @Override
        public String getDescricao() {
            return "IPI";
        }
    }

    public static class Pagamento {

        private String nomeEmpresa;
        private List<Imposto> impostos;

        // construtor
        public Pagamento(String nomeEmpresa) {
            this.nomeEmpresa = nomeEmpresa;
            this.impostos = new ArrayList<>();
        }

        // adiciona um imposto à lista de impostos do pagamento
        public void adicionarImposto(Imposto imposto) {
            impostos.add(imposto);
        }

        // exibe o resumo dos impostos cadastrados, mostrando a descrição e o valor calculado para cada 
        public void mostrarResumo() {
            for (Imposto imposto : impostos) {
                System.out.println(imposto.getDescricao() + ": R$ " + imposto.calcularImposto());
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pagamento pagamento = new Pagamento("Empresa XYZ");

        while (true) {

            System.out.println("Informe o tipo de imposto (PIS, IPI) ou 'pare' para sair:");
            String tipoImposto = scanner.nextLine();

            // verifica se o usuário deseja parar o cadastro de impostos
            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }

            // dependendo do tipo de imposto informado, solicita os dados necessários e calcula o imposto
            switch (tipoImposto.toUpperCase()) {
                case "PIS" -> {
                    // captura o valor do débito e crédito
                    System.out.println("Informe o valor de débito:");
                    double debito = scanner.nextDouble();
                    System.out.println("Informe o valor de crédito:");
                    double credito = scanner.nextDouble();
                    scanner.nextLine();
                    // Adiciona o imposto PIS na lista de impostos do pagamento
                    pagamento.adicionarImposto(new PIS(debito, credito));
                }

                case "IPI" -> {
                    // captura o valor do produto, frete, seguro, despesas e aliquota
                    System.out.println("Informe o valor do produto:");
                    double valorProduto = scanner.nextDouble();
                    System.out.println("Informe o valor do frete:");
                    double frete = scanner.nextDouble();
                    System.out.println("Informe o valor do seguro:");
                    double seguro = scanner.nextDouble();
                    System.out.println("Informe o valor de outras despesas:");
                    double outrasDespesas = scanner.nextDouble();
                    System.out.println("Informe a alíquota:");
                    double aliquota = scanner.nextDouble();
                    scanner.nextLine();
                    // adiciona o imposto IPI na lista de impostos do pagamento
                    pagamento.adicionarImposto(new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota));
                }

                // tratamento caso o usuário insira um tipo de imposto inválido
                default ->
                    System.out.println("Tipo de imposto inválido!");
            }
        }

        // mostra o resumo dos impostos cadastrados, com descrição e o valor calculado para cada um
        System.out.println("Resumo dos impostos:");
        pagamento.mostrarResumo();

        scanner.close();
    }
}
