package entities;

public class PessoaJuridica extends Contribuinte {
    private String nome;
    private double renda;
    private int numeroFuncionarios;
    
    public PessoaJuridica(){}
    
    public PessoaJuridica(String nome, double renda, int numeroFuncionarios) {
        this.nome = nome;
        this.renda = renda;
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getRenda() {
        return renda;
    }
    
    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    @Override
    public double impostosPagos(){
        if(numeroFuncionarios > 10) {
            return renda * 0.14;
        } else {
            return renda * 0.16;
        }
    };
}
