package entities;

public class PaypalService implements PaymentService {

    private double jurosMensal = 0.01;
    private double taxaPagamento = 0.02;
    
    
    @Override
    public double calcularJuros(double valor, int meses) {
        return valor * jurosMensal * meses;
    }

    @Override
    public double aplicarTaxa(double valor) {
        return valor * taxaPagamento;
    }

}
