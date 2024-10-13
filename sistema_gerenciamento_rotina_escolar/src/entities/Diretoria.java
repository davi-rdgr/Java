package entities;

public class Diretoria extends Usuario {

    private String tipo;

    // construtor
    public Diretoria(String tipo, String nome, String email, String senha) {
        this.tipo = tipo;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // getters
    public String getTipo() {
        return tipo;
    }

    // setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // métodos
    @Override
    public String toString() {
        return "DIRETORIA:\n nome: " + nome + "\n tipo: " + tipo + "\n email: " + email + "\n senha: " + senha;
    }
}
