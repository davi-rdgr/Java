package sistema_gerenciamento_rotina_escolar;

import entities.Aluno;
import entities.AlunoNota;
import entities.Diretoria;
import entities.Disciplina;
import entities.Frequencia;
import entities.HorarioAula;
import entities.Mensagem;
import entities.MensagemAluno;
import entities.Nota;
import entities.Professor;
import entities.SalaAula;
import entities.Turma;


public class Sistema_gerenciamento_rotina_escolar {

    public static void main(String[] args) {

        // Protótipo das funcionalidades:
        SalaAula sala1 = new SalaAula(101);
        System.out.println("Sala número: " + sala1.getNumero());

        Disciplina disciplina1 = new Disciplina("Matemática");
        System.out.println("Disciplina nome: " + disciplina1.getNome());

        Professor professor1 = new Professor("João Silva", 40, "joao@escola.com", "senha123", disciplina1);
        System.out.println("Professor nome: " + professor1.getNome() + " - Disciplina: " + professor1.getDisciplina().getNome());

        Aluno aluno1 = new Aluno("Maria Oliveira", 16, "maria@escola.com", "senha456");
        System.out.println("Aluno Nome: " + aluno1.getNome());

        Nota nota1 = new Nota(9.5);
        System.out.println("Nota valor: " + nota1.getValor());

        AlunoNota alunoNota1 = new AlunoNota(aluno1, nota1, disciplina1);
        System.out.println("Aluno: " + alunoNota1.getAluno().getNome() + " - Nota: " + alunoNota1.getNota().getValor() + " - Disciplina: " + alunoNota1.getDisciplina().getNome());

        Turma turma1 = new Turma("Turma 1A");
        System.out.println("Turma nome: " + turma1.getNome());

        HorarioAula horarioAula1 = new HorarioAula("segunda", "08:00", "09:30", sala1, turma1, professor1);
        System.out.println("Horário de Aula: " + horarioAula1.getDiaSemana() + " - " + horarioAula1.getHoraInicio() + " até " + horarioAula1.getHoraFim());

        Diretoria diretoria1 = new Diretoria("Diretor", "Carlos Souza", "carlos@escola.com", "senha789");
        System.out.println("Diretoria nome: " + diretoria1.getNome());

        Mensagem mensagem1 = new Mensagem(diretoria1, "Reunião amanhã às 10h.", "2024-09-30 10:00");
        System.out.println("Mensagem conteúdo: " + mensagem1.getConteudo() + " - Remetente: " + mensagem1.getRemetente().getNome());

        MensagemAluno mensagemAluno1 = new MensagemAluno(mensagem1, aluno1);
        System.out.println("Mensagem enviada para o Aluno: " + mensagemAluno1.getAluno().getNome() + " - Mensagem: " + mensagemAluno1.getMensagem().getConteudo());

        Frequencia frequencia1 = new Frequencia("2024-09-30 08:00", true, horarioAula1, aluno1, disciplina1);
        System.out.println("Frequência do Aluno: " + frequencia1.getAluno().getNome() + " - Disciplina: " + frequencia1.getDisciplina().getNome() + " - Presente: " + (frequencia1.estaPresente() ? "Sim" : "Não"));

    }
}
