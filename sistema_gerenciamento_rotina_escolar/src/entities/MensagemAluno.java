package entities;

public class MensagemAluno {

    private int id;
    private Mensagem mensagem;
    private Aluno aluno;

    // construtor
    public MensagemAluno(int id, Mensagem mensagem, Aluno aluno) {
        this.id = id;
        this.mensagem = mensagem;
        this.aluno = aluno;
    }

    // getters
    public int getId() {
        return id;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public Aluno getAluno() {
        return aluno;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
