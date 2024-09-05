package entities;

public class ContaBancaria {

    private int numeroConta;
    private String nome;
    private double deposito;

    // Construtores:
    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    public ContaBancaria(int numeroConta, String nome, double deposito) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.deposito = deposito;
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getDeposito() {
        return deposito;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    // FUNÇÕES
    public void gerarDeposito(double deposito) {
        this.deposito += deposito;
    }

    public void sacarDeposito(double deposito) {
        if (deposito < 0) {
            System.out.println("Valor negativo!");
        } else if (this.deposito < deposito) {
            System.out.println("Saldo insuficiente");
        } else {
            this.deposito -= deposito;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public String toString() {
        return "\n numero: " + this.numeroConta + "\n nome: " + this.nome + "\n saldo: " + this.deposito;
    }
}
