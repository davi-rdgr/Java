package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private int numeroContrato;
    private LocalDate dataContrato;
    private double valorContrato;
    private List<Installment> parcelas;

    public Contract(int numeroContrato, LocalDate dataContrato, double valorContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
        this.parcelas = new ArrayList<>();
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }
    
    public List<Installment> getParcela() {
        return parcelas;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }
    
    public String toString() {
        return "número do contrato: " + numeroContrato + "; data do contrato: " + dataContrato + "; valor do contrato: " + valorContrato;
    }
    
    public void gerarParcelas(int numMeses, PaymentService service) {
        for(int i = 1; i < numMeses; i ++) {
            LocalDate dataVencimento = dataContrato.plusMonths(i);
            
            double valorParcelaBase = valorContrato / numMeses;
            
            double valorComJuros = valorParcelaBase = service.calcularJuros(valorParcelaBase, i);
            double valorFinal = valorComJuros + service.aplicarTaxa(valorComJuros);
            
            parcelas.add(new Installment(dataVencimento, valorFinal));
        }
    }
}
