package entities;

public class Professor extends Usuario {

    private Disciplina disciplina;

    // construtor
    public Professor(String nome, int idade, String email, String senha, Disciplina disciplina) {
        super();
        this.disciplina = disciplina;
    }

    // getters e setters:
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // métodos
    @Override
    public String toString() {
        return "PROFESSOR: \n nome: " + nome + "\n idade: " + idade + "\n email: " + email + "\n senha: " + senha;
    }
}
