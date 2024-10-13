package entities;

public class Venda {
    private String nomeCliente;
        private String formaPagamento;
        private PacoteViagem pacoteViagem;
        private Hospedagem hospedagem;

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
            double totalEmDolar = getPacoteViagem().calcularPacotes(margemLucro, taxasAdicionais);
            double totalEmReais = converterValorParaReal(totalEmDolar, cotacaoDolar);

            System.out.println("Cliente: " + getNomeCliente());
            System.out.println("Forma de pagamento: " + getFormaPagamento());
            System.out.println("Destino: " + getPacoteViagem().getDestino());
            System.out.println("Transporte: " + getPacoteViagem().getTransporte().getTipo());
            System.out.println("Hospedagem: " + getHospedagem().getDescricao());
            System.out.println("Valor da diária: " + getHospedagem().getValorDiaria());
            System.out.println("Valor Total (US$): " + totalEmDolar);
            System.out.println("Valor Total (R$): " + totalEmReais + "\n");
        }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }
}
