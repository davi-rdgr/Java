package Exercicio_1;

public class Exercicio_1 {

    public static class Aluno {

        String nome;
        int matricula;
        String cpf;
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Celso Medeiros";
        aluno1.matricula = 1;
        aluno1.cpf = "00134578090";

        System.out.println("Nome do aluno1: " + aluno1.nome);
        System.out.println("Matrícula do aluno1: " + aluno1.matricula);
        System.out.println("CPF do aluno1: " + aluno1.cpf);
    }

}
