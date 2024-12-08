package sec15;

import entities.Contract;
import entities.Installment;
import entities.PaymentService;
import entities.PaypalService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sec15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTRE OS DADOS DO CONTRATO: \n ");
        System.out.println("Número do contrato: ");
        int numeroContrato = sc.nextInt();
        sc.nextLine();

        System.out.println("Data do contrato: dd/MM/yyyyy");
        String dataContrato = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate DateReformed = LocalDate.parse(dataContrato, dtf);

        System.out.println("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        Contract contract = new Contract(numeroContrato, DateReformed, valorContrato);

        System.out.println("Insira o número de meses para o parcelamento do contrato: ");
        int mesesParcelamento = sc.nextInt();

        PaypalService payser = new PaypalService();

        contract.gerarParcelas(mesesParcelamento, payser);

        System.out.println("Parcelas: ");
        for (Installment parcela : contract.getParcela()) {
            System.out.println(parcela);
        }

    }

}
