package entities;

public class PIS implements Imposto {

    private double credito;
    private double debito;

    public PIS(double credito, double debito) {
        this.credito = credito;
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    @Override
    public double calcularImpostos() {
        return (getDebito() - getCredito()) * 0.0165;
    }

    @Override
    public String pegarDescricao() {
        return "tipo PIS";
    }
}
