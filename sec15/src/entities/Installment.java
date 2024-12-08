package entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate dataVencimento;
    private double valor;

    public Installment(LocalDate dataVencimento, double valor) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Data: " + dataVencimento + ", Valor: " + String.format("%.2f", valor);
    }
}
