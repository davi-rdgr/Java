package entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Torre {

    private Queue<Aviao> filaPouso;
    private Queue<Aviao> filaDecolagem;
    private List<Aviao> espacoAereo;

    // construtor:


    public Torre() {
        this.filaPouso = new LinkedList<>();
        this.filaDecolagem = new LinkedList<>();
        this.espacoAereo = new LinkedList<>();
    }

    
    
    
    // getters e setters:
    public Queue<Aviao> getFilaPouso() {
        return filaPouso;
    }

    public void setFilaPouso(Queue<Aviao> filaPouso) {
        this.filaPouso = filaPouso;
    }

    public Queue<Aviao> getFilaDecolagem() {
        return filaDecolagem;
    }

    public void setFilaDecolagem(Queue<Aviao> filaDecolagem) {
        this.filaDecolagem = filaDecolagem;
    }

    public List<Aviao> getEspacoAereo() {
        return espacoAereo;
    }

    public void setEspacoAereo(List<Aviao> espacoAereo) {
        this.espacoAereo = espacoAereo;
    }

    // metodos:
    // adicionar um avião à fila de pouso:
    public void adicionarFilaPouso(Aviao aviao) {
        filaPouso.add(aviao);
        System.out.println("Avião adicionado à fila de pouso: " + aviao.getCompanhia());
    }

    // autorizar pouso (removendo o primeiro avião da fila):
    public Aviao autorizarPouso() {
        if (!filaPouso.isEmpty()) {
            Aviao aviao = filaPouso.poll(); // Remove o primeiro da fila
            System.out.println("Pouso autorizado para o avião: " + aviao.getCompanhia());
            return aviao;
        }
        System.out.println("Nenhum avião na fila de pouso.");
        return null;
    }

    // adiciona um avião à fila de decolagem:
    public void adicionarFilaDecolagem(Aviao aviao) {
        filaDecolagem.add(aviao);
        System.out.println("Avião adicionado à fila de decolagem: " + aviao.getCompanhia());
    }

    // autorizar decolagem (remove o primeiro avião da fila e adiciona ao espaço aereo):
    public void autorizarDecolagem() {
        if (!filaDecolagem.isEmpty()) {
            Aviao aviao = filaDecolagem.poll();
            espacoAereo.add(aviao);
            System.out.println("Decolagem autorizada para o avião: " + aviao.getCompanhia());
        } else {
            System.out.println("Nenhum avião na fila de decolagem");
        }
    }

    // remove avião do espaço aereo:
    public void removerEspacoAereo(Aviao aviao) {
        espacoAereo.remove(aviao);
        System.out.println("Avião removido do espaço aéreo: " + aviao.getCompanhia());
    }

    // exibir aviões no espaço aéreo:
    public void exibirEspacoAereo() {
        if (!espacoAereo.isEmpty()) {
            System.out.println("Aviões no espaço aéreo: ");
            for (Aviao aviao : espacoAereo) {
                System.out.println(aviao.getCompanhia());
            }
        } else {
            System.out.println("Nenhum avião no espaço aéreo");
        }
    }

}
