package atv4;

import entities.PIS;
import entities.IPI;
import entities.Pagamento;
import java.util.Scanner;

public class ATV4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome da empresa? ");
        String nomeEmpresa = scanner.nextLine();

        Pagamento pagamento = new Pagamento(nomeEmpresa);

        while (true) {
            System.out.println("Qual o tipo do imposto? PIS - IPI - 'pare' para encerrar: ");
            String tipoImposto = scanner.nextLine();

            if (tipoImposto.equals("pare")) {
                break;
            }

            switch (tipoImposto.toUpperCase()) {
                case "PIS": {
                    System.out.println("Qual o valor do débito? ");
                    double debito = scanner.nextDouble();
                    System.out.println("Qual o valor do crédito? ");
                    double credito = scanner.nextDouble();
                    scanner.nextLine();
                    pagamento.adicionarImpostos(new PIS(debito, credito));
                    break;
                }

                case "IPI": {
                    System.out.println("Qual o valor do produto? ");
                    double produto = scanner.nextDouble();
                    System.out.println("Qual o valor do frete? ");
                    double frete = scanner.nextDouble();
                    System.out.println("Qual o valor do seguro? ");
                    double seguro = scanner.nextDouble();
                    System.out.println("Qual o valor das outras despesas? ");
                    double despesas = scanner.nextDouble();
                    System.out.println("Qual a aliquota? ");
                    double aliquota = scanner.nextDouble();
                    scanner.nextLine();
                    pagamento.adicionarImpostos(new IPI(produto, frete, seguro, despesas, aliquota));
                    break;
                }

                default: {
                    System.out.println("Opção inválida");
                }
            }
        }
        
        System.out.println("IMPOSTOS: ");
        pagamento.resumo();
        scanner.close();
    }

}
