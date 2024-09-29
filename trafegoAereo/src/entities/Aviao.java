package entities;

public class Aviao {

    private int numeroVoo;
    private String companhia;
    private String status;
    private int capacidade;

    // construtor:
    public Aviao() {
    }

    public Aviao(int numeroVoo, String companhia, String status, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.companhia = companhia;
        this.status = status;
        this.capacidade = capacidade;
    }

    // getters e setters:
    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // métodos: 
    public boolean decolar() {
        if (this.status.equals("em solo")) {
            this.status = "no ar";
            return true;
        } else {
            return false;
        }
    }

    public boolean pousar() {
        if (this.status.equals("no ar")) {
            this.status = "em solo";
            return true;
        } else {
            return false;
        }
    }

    public String status() {
        return this.status;
    }

    public String toString() {
        return "AVIAO \n Numero voo: " + numeroVoo + "\n companhia: " + companhia + "\n status: " + status + "\n capacidade: " + capacidade;
    }
}
