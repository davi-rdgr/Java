package entities;

import java.awt.Color;

public class Barco extends TransporteMaritimo {

    public Barco(int capacidade, String modelo, int anoFabricacao, Color color, double velocidadeMaxima) {
        super(capacidade, modelo, anoFabricacao, color, velocidadeMaxima);
    }

}
