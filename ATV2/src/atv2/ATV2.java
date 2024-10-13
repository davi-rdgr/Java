package atv2;

import entities.Hospedagem;
import entities.PacoteViagem;
import entities.Transporte;
import entities.Venda;
import java.util.Scanner;

public class ATV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuarLoopGeral = "S";

        while (continuarLoopGeral.equalsIgnoreCase("S")) {
            System.out.println("1. Comprar Pacote de Viagem");
            System.out.println("2. Sair");

            int escolhaMenu = scanner.nextInt();
            scanner.nextLine();

            double valorTransporte = 0;
            switch (escolhaMenu) {
                case 1 -> {
                    System.out.print("Informe o tipo de transporte (Aéreo - $2000.00, Rodoviário - $800.00, Marítimo - $1200.00): ");
                    String tipoTransporte = scanner.nextLine();

                    if (tipoTransporte.equalsIgnoreCase("Aéreo")) {
                        valorTransporte = 2000.00;
                    } else if (tipoTransporte.equalsIgnoreCase("Rodoviário")) {
                        valorTransporte = 800.00;
                    } else if (tipoTransporte.equalsIgnoreCase("Marítimo")) {
                        valorTransporte = 1200.00;
                    }

                    Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

                    System.out.print("Informe a quantidade de estrelas do hotel (3 - $500.00, 4 - $800.00, 5 - $1200.00):");
                    int estrelasHotel = scanner.nextInt();
                    scanner.nextLine();

                    double valorDiaria = 0;
                    String descHospedagem = "";
                    if (estrelasHotel == 5) {
                        descHospedagem = "Hotel 5 estrelas";
                        valorDiaria = 1200.00;
                    } else if (estrelasHotel == 4) {
                        descHospedagem = "Hotel 4 estrelas";
                        valorDiaria = 800.00;
                    } else if (estrelasHotel == 3) {
                        descHospedagem = "Hotel 3 estrelas";
                        valorDiaria = 500.00;
                    }

                    Hospedagem hospedagem = new Hospedagem(descHospedagem, valorDiaria);

                    System.out.print("Informe o destino (SP, RJ, PR, SC, RS, RN): ");
                    String destino = scanner.nextLine();

                    System.out.print("Informe a quantidade de dias: ");
                    int qntDias = scanner.nextInt();
                    scanner.nextLine();

                    PacoteViagem pacoteviagem = new PacoteViagem(transporte, hospedagem, destino, qntDias);

                    System.out.print("Informe o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Informe a forma de pagamento: ");
                    String formaPagamento = scanner.nextLine();

                    System.out.println("Informe a margem de lucro em %: ");
                    double margemLucro = scanner.nextDouble();
                    System.out.println("Informe o valor das taxas adicionais: ");
                    double taxasAdicionais = scanner.nextDouble();

                    System.out.println("Informe a cotação do dolar: ");
                    double cotacaoDolar = scanner.nextDouble();

                    Venda venda = new Venda(nomeCliente, formaPagamento, pacoteviagem, hospedagem);

                    venda.mostrarInfoVendas(cotacaoDolar, margemLucro, taxasAdicionais);
                    
                    break;
                }
                case 2 -> {
                    System.out.println("Fim de execução");
                    continuarLoopGeral = "N";
                }
                default ->
                    System.out.println("Opção inválida!");
            }
        }
    }

}
