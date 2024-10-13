package entities;

public class PessoaFisica extends Contribuinte {

    private String nome;
    private double renda;
    private double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double renda, double gastosSaude) {
        this.nome = nome;
        this.renda = renda;
        this.gastosSaude = gastosSaude;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void setGastosSaude(int gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double impostosPagos() {
        if (gastosSaude <= 0) {
            if (renda <= 20000.00) {
                return renda * 0.15;
            } else if (renda > 20000.00) {
                return renda * 0.25;
            }
        }
        return (renda * 1.25) - (gastosSaude * 1.50);
    }
;

}
