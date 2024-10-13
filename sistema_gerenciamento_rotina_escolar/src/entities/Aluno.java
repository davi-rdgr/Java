package entities;

public class Aluno extends Usuario {

    // construtor:
    public Aluno(String nome, int idade, String email, String senha) {
        super();
    }


    // métodos
    @Override
    public String toString() {
        return "ALUNO: \n nome: " + nome + "\n idade: " + idade + "\n email: " + email + "\n senha: " + senha;
    }

}
