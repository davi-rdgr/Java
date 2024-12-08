package entities;

import java.awt.Color;
import utilities.Veiculo_interface;

public abstract class TransporteMaritimo implements Veiculo_interface {

    private final int capacidade;
    private final String modelo;
    private final int anoFabricacao;
    private Color color;
    private final int rodas;
    private double velocidadeMaxima;

    public TransporteMaritimo(int capacidade, String modelo, int anoFabricacao, Color color, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.color = color;
        this.rodas = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int getRodas() {
        return rodas;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n Capacidade: " + capacidade + " \n Fabricação: " + anoFabricacao + " \n Cor: " + color;
    }

}
