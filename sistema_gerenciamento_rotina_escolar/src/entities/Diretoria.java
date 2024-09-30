package entities;

public class Diretoria {

    private int id;
    private String tipo;
    private String nome;
    private String email;
    private String senha;

    // construtor
    public Diretoria(int id, String tipo, String nome, String email, String senha) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // métodos
    public String toString() {
        return "DIRETORIA: \n id: " + id + "\n nome: " + nome + "\n tipo: " + tipo + "\n email: " + email + "\n senha: " + senha;
    }
}
