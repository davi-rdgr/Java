package entities;

public class Clientes {

    private String nome;
    private String telefone;
    private String CPF;
    private String data;
    private Boolean paciente;

    public Clientes(String nome, String telefone, String CPF, String data, Boolean paciente) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.data = data;
        this.paciente = paciente;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getPaciente() {
        return paciente;
    }

    public void setPaciente(Boolean paciente) {
        this.paciente = paciente;
    }
}
