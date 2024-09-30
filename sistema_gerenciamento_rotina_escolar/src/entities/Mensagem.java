package entities;

public class Mensagem {

    private int id;
    private Diretoria remetente;
    private String conteudo;
    private String dataEnvio;

    // construtor
    public Mensagem(int id, Diretoria remetente, String conteudo, String dataEnvio) {
        this.id = id;
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
    }

    // getters
    public int getId() {
        return id;
    }

    public Diretoria getRemetente() {
        return remetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setRemetente(Diretoria remetente) {
        this.remetente = remetente;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}
