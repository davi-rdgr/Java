package entities;

public class Voo {

    private String origem;
    private String destino;
    private double duracao;
    private int numeroVoo;
    private Aviao aviao;
    private Piloto piloto;

    // construtor:
    public Voo(String origem, String destino, double duracao, int numeroVoo, Aviao aviao, Piloto piloto) {
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
        this.numeroVoo = numeroVoo;
        this.aviao = aviao;
        this.piloto = piloto;
    }

    // getters e setters:
    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public String exibirRota() {
        return "VOO \n Saindo de " + origem + " para " + destino + " em " + duracao + " horas";
    }

    public String exibirTeste() {
        return "Origem: " + getOrigem() + ", Destino: " + getDestino()
                + ", Duração: " + getDuracao() + ", Nº Voo: " + getNumeroVoo()
                + ", Nome Piloto: " + piloto.getNome() + ", Avião: " + aviao.getCompanhia();
    }
}
