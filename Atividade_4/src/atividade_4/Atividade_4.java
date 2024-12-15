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

        @Override
        public double calcularImposto() {
            return (debito - credito) * 0.0165;
        }

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

        @Override
        public double calcularImposto() {
            double baseCalculo = valorProduto + frete + seguro + outrasDespesas;
            return baseCalculo * (aliquota / 100);
        }

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

        public void adicionarImposto(Imposto imposto) {
            impostos.add(imposto);
        }

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

            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }

            switch (tipoImposto.toUpperCase()) {
                case "PIS" -> {
                    System.out.println("Informe o valor de débito:");
                    double debito = scanner.nextDouble();
                    System.out.println("Informe o valor de crédito:");
                    double credito = scanner.nextDouble();
                    scanner.nextLine();
                    pagamento.adicionarImposto(new PIS(debito, credito));
                }

                case "IPI" -> {
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
                    pagamento.adicionarImposto(new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota));
                }

                default ->
                    System.out.println("Tipo de imposto inválido!");
            }
        }

        System.out.println("Resumo dos impostos:");
        pagamento.mostrarResumo();

        scanner.close();
    }
}
