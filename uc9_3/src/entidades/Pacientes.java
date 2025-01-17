package entidades;

import java.util.Date;

public class Pacientes {

    private String nome;
    private String telefone;
    private String CPF;
    private Date data;
    private Boolean paciente;
    private Boolean consulta;
    private String receita;

    public Pacientes(String nome, String telefone, String CPF, Date data, Boolean paciente) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.data = data;
        this.paciente = paciente;
        this.consulta = false;
        this.receita = "";
    }

    public Pacientes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getPaciente() {
        return paciente;
    }

    public void setPaciente(Boolean paciente) {
        this.paciente = paciente;
    }

    public Boolean getConsulta() {
        return consulta;
    }

    public void setConsulta(Boolean consulta) {
        this.consulta = consulta;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
}
