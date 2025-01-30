package br.com.senac.financasjpa2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nome_ep;
    private int num_ep;
    private String duracao;
    private String url;

    public Podcast(String produtor, String nome_ep, int num_ep, String duracao, String url) {
        this.produtor = produtor;
        this.nome_ep = nome_ep;
        this.num_ep = num_ep;
        this.duracao = duracao;
        this.url = url;
    }

    public Podcast() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNome_ep() {
        return nome_ep;
    }

    public void setNome_ep(String nome_ep) {
        this.nome_ep = nome_ep;
    }

    public int getNum_ep() {
        return num_ep;
    }

    public void setNum_ep(int num_ep) {
        this.num_ep = num_ep;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
