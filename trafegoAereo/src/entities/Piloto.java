package entities;

public class Piloto {

    private String nome;
    private int idade;
    private int licenca;
    private String companhiaPiloto;

    // construtor:
    public Piloto(String nome, int idade, int licenca, String companhiaPiloto) {
        this.nome = nome;
        this.idade = idade;
        this.licenca = licenca;
        this.companhiaPiloto = companhiaPiloto;
    }

    // getters e setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getLicenca() {
        return licenca;
    }

    public void setLicenca(int licenca) {
        this.licenca = licenca;
    }

    public String getCompanhia() {
        return companhiaPiloto;
    }

    public void setCompanhia(String companhiaPiloto) {
        this.companhiaPiloto = companhiaPiloto;
    }

    @Override
    public String toString() {
        return "PILOTO \n Nome: " + nome + "\n idade: " + idade + "\n licenca: " + licenca + "\n companhia: " + companhiaPiloto;
    }

}
