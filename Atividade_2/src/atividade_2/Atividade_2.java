package atividade_2;

import java.util.Scanner;

public class Atividade_2 {

    // Classe de Transporte: ---------------------------------------------------
    public static class Transporte {

        private String tipo;
        private double valor;

        // Método construtor:
        public Transporte(String tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        // Getters:
        public String getTipo() {
            return this.tipo;
        }

        public double getValor() {
            return this.valor;
        }

        // Setters:
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }

    // Classe de Hospedagem ----------------------------------------------------
    public static class Hospedagem {

        private String descricao;
        private double valorDiaria;

        // Método construtor:
        public Hospedagem(String descricao, double valorDiaria) {
            this.descricao = descricao;
            this.valorDiaria = valorDiaria;
        }

        // Getters:
        public String getDescricao() {
            return descricao;
        }

        public double getValorDiaria() {
            return valorDiaria;
        }

        // Setters:
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setValorDiaria(double valorDiaria) {
            this.valorDiaria = valorDiaria;
        }
    }

    // Classe Pacote de Viagem -------------------------------------------------
    public static class PacoteViagem {

        private Transporte transporte;
        private Hospedagem hospedagem;
        private String destino;
        private int qntDias;

        // Método construtor:
        public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int qntDias) {
            this.transporte = transporte;
            this.hospedagem = hospedagem;
            this.destino = destino;
            this.qntDias = qntDias;
        }

        public double calcularHospedagem() {
            return this.qntDias * this.hospedagem.getValorDiaria();
        }

        public double calcularLucro(double margem) {
            return calcularHospedagem() * (1 + margem / 100);
        }

        public double calcularPacotes(double margemLucro, double taxasAdicionais) {
            double totalHospedagem = calcularHospedagem();
            double valorLucro = calcularLucro(margemLucro);

            return this.transporte.getValor() + totalHospedagem + valorLucro + taxasAdicionais;
        }

        // Getters:
        public Transporte getTransporte() {
            return transporte;
        }

        public Hospedagem getHospedagem() {
            return hospedagem;
        }

        public String getDestino() {
            return destino;
        }

        public int getQntDias() {
            return qntDias;
        }

        // Setters: 
        public void setTransporte(Transporte transporte) {
            this.transporte = transporte;
        }

        public void setHospedagem(Hospedagem hospedagem) {
            this.hospedagem = hospedagem;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public void setQntDias(int qntDias) {
            this.qntDias = qntDias;
        }
    }

    // Clásse Venda ------------------------------------------------------------
    public static class Venda {

        private String nomeCliente;
        private String formaPagamento;
        private PacoteViagem pacoteViagem;
        private Hospedagem hospedagem;

        // Método construtor:
        public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem, Hospedagem hospedagem) {
            this.nomeCliente = nomeCliente;
            this.formaPagamento = formaPagamento;
            this.pacoteViagem = pacoteViagem;
            this.hospedagem = hospedagem;
        }

        public double converterValorParaReal(double valorDolar, double cotacaoDolar) {
            return valorDolar * cotacaoDolar;
        }

        public void mostrarInfoVendas(double cotacaoDolar, double margemLucro, double taxasAdicionais) {
            double totalEmDolar = pacoteViagem.calcularPacotes(margemLucro, taxasAdicionais);
            double totalEmReais = converterValorParaReal(totalEmDolar, cotacaoDolar);

            System.out.println("--------------------------------------------------------------------------- \n");
            System.out.println("Cliente: " + nomeCliente);
            System.out.println("Forma de pagamento: " + formaPagamento);
            System.out.println("Destino: " + pacoteViagem.getDestino());
            System.out.println("Transporte: " + pacoteViagem.getTransporte().getTipo());
            System.out.println("Hospedagem: " + hospedagem.getDescricao());
            System.out.println("Valor da diária: " + hospedagem.getValorDiaria());
            System.out.println("Valor Total (US$): " + totalEmDolar);
            System.out.println("Valor Total (R$): " + totalEmReais + "\n");
            System.out.println("--------------------------------------------------------------------------- \n");
        }

        // Getters e Setters:
        public String getNomeCliente() {
            return nomeCliente;
        }

        public String getFormaPagamento() {
            return formaPagamento;
        }

        public PacoteViagem getPacoteViagem() {
            return pacoteViagem;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public void setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
        }

        public void setPacoteViagem(PacoteViagem pacoteViagem) {
            this.pacoteViagem = pacoteViagem;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continuarLoopGeral = "S";

        while (continuarLoopGeral.equalsIgnoreCase("S")) {

            System.out.println("--------------------------------------------------------------------------- \n");
            System.out.println("Bem vindo ao gerenciamento de pacotes de viagem! \n \n");
            System.out.println("O que deseja fazer? \n");
            System.out.println("1. Realizar uma viagem");
            System.out.println("2. Ver os planos de transporte");
            System.out.println("3. Ver os destinos possiveis");
            System.out.println("4. Sair \n");
            System.out.println("--------------------------------------------------------------------------- \n");

            int escolhaMenu = scanner.nextInt();
            if (escolhaMenu == 4) {
                System.out.println("Ate a proxima! :)");
                break;
            }

            if (escolhaMenu == 1 || escolhaMenu == 2 || escolhaMenu == 3) {

                switch (escolhaMenu) {
                    case 1 -> {
                        System.out.println("---------------------------------------------------------------------------\n");
                        System.out.println("Informacoes para a viagem: \n \n");
                        System.out.println("Informe o tipo de transporte (ex: Aereo): \n");
                        System.out.println("Aereo // $1000.00");
                        System.out.println("Rodoviario // $600.00");
                        System.out.println("Maritimo // $700.00 \n");
                        System.out.println("---------------------------------------------------------------------------\n");
                        scanner.nextLine();

                        // Coletar dados do transporte
                        String tipoTransporte = scanner.nextLine();
                        double valorTransporte = 0;
                        if (tipoTransporte.equalsIgnoreCase("Aereo")) {
                            valorTransporte = 1000.00;
                        } else if (tipoTransporte.equalsIgnoreCase("Rodoviario")) {
                            valorTransporte = 600.00;
                        } else if (tipoTransporte.equalsIgnoreCase("Maritimo")) {
                            valorTransporte = 700.00;
                        }

                        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

                        System.out.println("--------------------------------------------------------------------------- \n");
                        System.out.println("Informacoes para a viagem: \n \n");
                        System.out.println("Informe a qualidade do Hotel: (ex: 5, 4) \n");
                        System.out.println("Hotel 5 estrelas // $800.00");
                        System.out.println("Hotel 4 estrelas // $600.00");
                        System.out.println("Hotel 3 estrelas // $400.00 \n");
                        System.out.println("--------------------------------------------------------------------------- \n");

                        // Coletar dados da hospedagem
                        double valorDiaria = 0;
                        int descHotel = scanner.nextInt();
                        String descricaoHospedagem = "";
                        if (descHotel == 5) {
                            descricaoHospedagem = "Hotel 5 estrelas";
                            valorDiaria = 800.00;
                        } else if (descHotel == 4) {
                            descricaoHospedagem = "Hotel 4 estrelas";
                            valorDiaria = 600.00;
                        } else if (descHotel == 3) {
                            descricaoHospedagem = "Hotel 3 estrelas";
                            valorDiaria = 400.00;
                        }

                        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiaria);

                        System.out.println("--------------------------------------------------------------------------- \n");
                        System.out.println("Informacoes para a viagem: \n \n");
                        System.out.println("Informe o destino: (ex: Sao Paulo) \n \n");
                        System.out.println("1. SP - Sao Paulo");
                        System.out.println("2. RJ - Rio de Janeiro");
                        System.out.println("3. PR - Curitiba \n");
                        System.out.println("--------------------------------------------------------------------------- \n");

                        // Coletar dados do pacote de viagem
                        scanner.nextLine();
                        String destino = scanner.nextLine();
                        System.out.print("Informe a quantidade de dias: ");
                        int qntDias = scanner.nextInt();

                        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, qntDias);

                        // Coletar dados da venda
                        System.out.println("--------------------------------------------------------------------------- \n");
                        System.out.println("Informacoes sobre o cliente: \n \n");
                        System.out.println("Informe o nome do cliente: ");
                        scanner.nextLine();
                        String nomeCliente = scanner.nextLine();
                        System.out.println("Informe a forma de pagamento: ");
                        String formaPagamento = scanner.nextLine();

                        System.out.println("Informe a margem de lucro em %: ");
                        double margemLucro = scanner.nextDouble();
                        System.out.println("Informe o valor das taxas adicionais: ");
                        double taxasAdicionais = scanner.nextDouble();

                        System.out.println("Informe a cotacao do dolar: ");
                        double cotacaoDolar = scanner.nextDouble();

                        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem, hospedagem);

                        venda.mostrarInfoVendas(cotacaoDolar, margemLucro, taxasAdicionais);
                        break;
                    }
                    case 2 -> {
                        int menucontinuar = 0;
                        while (menucontinuar == 0) {
                            System.out.println("--------------------------------------------------------------------------- \n");
                            System.out.println("Planos para transporte disponiveis: \n \n");
                            System.out.println("Aereo");
                            System.out.println("Rodoviario");
                            System.out.println("Maritimo");
                            System.out.println("4. Voltar \n");
                            menucontinuar = scanner.nextInt();
                            System.out.println("--------------------------------------------------------------------------- \n");
                        }
                        break;
                    }
                    case 3 -> {
                        int menucontinuar = 0;
                        while (menucontinuar == 0) {
                            System.out.println("---------------------------------------------------------------------------\n");
                            System.out.println("Ver os destinos possiveis atualmente: \n \n");
                            System.out.println("SP - Sao Paulo");
                            System.out.println("RJ - Rio de Janeiro");
                            System.out.println("PR - Curitiba");
                            System.out.println("4. Voltar \n");
                            menucontinuar = scanner.nextInt();
                            System.out.println("--------------------------------------------------------------------------- \n");
                        }
                        break;
                    }
                }
            } else {
                System.out.println("Escolha invalida! Apenas numeros de 1 - 3");
            }
        }
    }

}
