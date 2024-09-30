package entities;

public class HorarioAula {

    private int id;
    private String diaSemana;
    private String horaInicio;
    private String horaFim;
    private SalaAula salaaula;
    private Turma turma;
    private Professor professor;

    // construtor
    public HorarioAula(int id, String diaSemana, String horaInicio, String horaFim, SalaAula sala, Turma turma, Professor professor) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.salaaula = sala;
        this.turma = turma;
        this.professor = professor;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public SalaAula getSalaAula() {
        return salaaula;
    }

    public Turma getTurma() {
        return turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setHoraInicio(String HoraInicio) {
        this.horaInicio = HoraInicio;
    }

    public void setHoraFim(String HoraFim) {
        this.horaFim = HoraFim;
    }

    public void setSalaAula(SalaAula salaaula) {
        this.salaaula = salaaula;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
