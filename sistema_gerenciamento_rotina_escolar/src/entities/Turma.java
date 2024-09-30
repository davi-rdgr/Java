package entities;

public class Turma {

    private int id;
    private String nome;

    // construtor
    public Turma(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
