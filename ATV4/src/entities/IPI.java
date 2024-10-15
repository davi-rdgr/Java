package entities;

public class IPI implements Imposto {

    private double valorProduto;
    private double valorFrete;
    private double seguro;
    private double despesas;
    private double aliquota;

    public IPI(double valorProduto, double valorFrete, double seguro, double despesas, double aliquota) {
        this.valorProduto = valorProduto;
        this.valorFrete = valorFrete;
        this.seguro = seguro;
        this.despesas = despesas;
        this.aliquota = aliquota;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public double calcularImpostos() {
        double base = valorProduto + seguro + valorFrete + despesas;
        return base * (aliquota / 100);
    }

    @Override
    public String pegarDescricao() {
        return "tipo IPI";
    }

}
