package entities;

public interface PaymentService {

    double calcularJuros(double valor, int meses);

    double aplicarTaxa(double valor);
}
