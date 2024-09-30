package entities;

public class SalaAula {

    private int id;
    private int numero;

    // construtor
    public SalaAula(int id, int numero) {
        this.id = id;
        this.numero = numero;
    }

    // getters
    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
