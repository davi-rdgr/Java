package entities;

public class Aluno {

    private int id;
    private String nome;
    private int idade;
    private String email;
    private String senha;

    // construtor:
    public Aluno(int id, String nome, int idade, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // métodos
    public String toString() {
        return "ALUNO: \n id: " + id + "\n nome: " + nome + "\n idade: " + idade + "\n email: " + email + "\n senha: " + senha;
    }

}
