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
        
        
        SalaAula sala1 = new SalaAula(1, 101);
        System.out.println("Sala: " + sala1.getId() + " - Número: " + sala1.getNumero());

        Disciplina disciplina1 = new Disciplina(1, "Matemática");
        System.out.println("Disciplina: " + disciplina1.getId() + " - Nome: " + disciplina1.getNome());

        Professor professor1 = new Professor(1, "João Silva", 40, "joao@escola.com", "senha123", disciplina1);
        System.out.println("Professor: " + professor1.getId() + " - Nome: " + professor1.getNome() + " - Disciplina: " + professor1.getDisciplina().getNome());

        Aluno aluno1 = new Aluno(1, "Maria Oliveira", 16, "maria@escola.com", "senha456");
        System.out.println("Aluno: " + aluno1.getId() + " - Nome: " + aluno1.getNome());

        Nota nota1 = new Nota(1, 9.5);
        System.out.println("Nota: " + nota1.getId() + " - Valor: " + nota1.getValor());

        AlunoNota alunoNota1 = new AlunoNota(1, aluno1, nota1, disciplina1);
        System.out.println("Aluno: " + alunoNota1.getAluno().getNome() + " - Nota: " + alunoNota1.getNota().getValor() + " - Disciplina: " + alunoNota1.getDisciplina().getNome());

        Turma turma1 = new Turma(1, "Turma 1A");
        System.out.println("Turma: " + turma1.getId() + " - Nome: " + turma1.getNome());

        HorarioAula horarioAula1 = new HorarioAula(1, "segunda", "08:00", "09:30", sala1, turma1, professor1);
        System.out.println("Horário de Aula: " + horarioAula1.getId() + " - " + horarioAula1.getDiaSemana() + " - " + horarioAula1.getHoraInicio() + " até " + horarioAula1.getHoraFim());

        Diretoria diretoria1 = new Diretoria(1, "Diretor", "Carlos Souza", "carlos@escola.com", "senha789");
        System.out.println("Diretoria: " + diretoria1.getId() + " - Nome: " + diretoria1.getNome());

        Mensagem mensagem1 = new Mensagem(1, diretoria1, "Reunião amanhã às 10h.", "2024-09-30 10:00");
        System.out.println("Mensagem: " + mensagem1.getId() + " - Conteúdo: " + mensagem1.getConteudo() + " - Remetente: " + mensagem1.getRemetente().getNome());

        MensagemAluno mensagemAluno1 = new MensagemAluno(1, mensagem1, aluno1);
        System.out.println("Mensagem enviada para o Aluno: " + mensagemAluno1.getAluno().getNome() + " - Mensagem: " + mensagemAluno1.getMensagem().getConteudo());

        Frequencia frequencia1 = new Frequencia(1, "2024-09-30 08:00", true, horarioAula1, aluno1, disciplina1);
        System.out.println("Frequência do Aluno: " + frequencia1.getAluno().getNome() + " - Disciplina: " + frequencia1.getDisciplina().getNome() + " - Presente: " + (frequencia1.isPresente() ? "Sim" : "Não"));
    }
}
