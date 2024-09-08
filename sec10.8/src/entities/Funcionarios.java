package entities;

public class Funcionarios {

    private int id;
    private String nome;
    private double salario;

    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getName() {
        return nome;
    }

    public void aplicarAumento(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }

    public String toString() {
        return "\n id :" + id + "\n nome: " + nome + "\n salario: " + salario + "\n";
    }
}
