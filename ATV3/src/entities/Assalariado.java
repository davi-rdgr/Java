package entities;

public class Assalariado extends Funcionario {

    private double salario;

    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salario) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public double aplicarAumento(double percentual) {
        return salario += salario * (percentual / 100);
    }
}
