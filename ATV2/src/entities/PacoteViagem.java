package entities;

public class PacoteViagem {
     private Transporte transporte;
        private Hospedagem hospedagem;
        private String destino;
        private int qntDias;

        public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int qntDias) {
            this.transporte = transporte;
            this.hospedagem = hospedagem;
            this.destino = destino;
            this.qntDias = qntDias;
        }

        public double calcularHospedagem() {
            return this.getQntDias() * this.getHospedagem().getValorDiaria();
        }

        public double calcularLucro(double margem) {
            return calcularHospedagem() * (1 + margem / 100);
        }

        public double calcularPacotes(double margemLucro, double taxasAdicionais) {
            double totalHospedagem = calcularHospedagem();
            double valorLucro = calcularLucro(margemLucro);

            return this.getTransporte().getValor() + totalHospedagem + valorLucro + taxasAdicionais;
        }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQntDias() {
        return qntDias;
    }

    public void setQntDias(int qntDias) {
        this.qntDias = qntDias;
    }
}
