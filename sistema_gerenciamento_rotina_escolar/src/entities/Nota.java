package entities;

public class Nota {

    private int id;
    private double valor;

    // construtor
    public Nota(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    // getters
    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
