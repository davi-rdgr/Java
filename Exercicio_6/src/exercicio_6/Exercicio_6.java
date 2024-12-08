package exercicio_6;

import entities.Aviao;
import entities.Barco;
import entities.Carro;
import entities.Motocicleta;
import entities.Onibus;
import entities.TransporteAereo;
import entities.TransporteMaritimo;
import entities.TransporteTerrestre;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<TransporteTerrestre> TT = new ArrayList<>();
        ArrayList<TransporteAereo> TA = new ArrayList<>();
        ArrayList<TransporteMaritimo> TM = new ArrayList<>();

        String continuar = "S";

        do {

            System.out.println("Escolha o tipo de veículo: Terrestre, Aereo, Maritimo");
            String transporte = sc.nextLine();

            String tipoTerrestre = "";
            int capacidade = 0;
            String modelo = "";
            int anoFabricacao = 0;
            String cor = "";
            int rodas = 0;
            double peso = 0;

            switch (transporte.toLowerCase()) {

                case "terrestre":
                    System.out.println("Insira o tipo de veículo terrestre: Carro, Onibus, Motocicleta");
                    tipoTerrestre = sc.nextLine();
                    System.out.println("Insira a capacidade: ");
                    capacidade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o modelo do veículo: ");
                    modelo = sc.nextLine();
                    System.out.println("Insira o ano de fabricação do veículo: ");
                    anoFabricacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira a cor do veículo: ");
                    cor = sc.nextLine();
                    cor.toLowerCase();
                    System.out.println("Insira o número de rodas do veículo: ");
                    rodas = sc.nextInt();

                    if (tipoTerrestre.equalsIgnoreCase("carro")) {
                        TransporteTerrestre tti = new Carro(capacidade, modelo, anoFabricacao, getColorFromString(cor), rodas);
                        TT.add(tti);
                    } else if (tipoTerrestre.equalsIgnoreCase("onibus")) {
                        TransporteTerrestre tti = new Onibus(capacidade, modelo, anoFabricacao, getColorFromString(cor), rodas);
                        TT.add(tti);
                    } else if (tipoTerrestre.equalsIgnoreCase("motocicleta")) {
                        TransporteTerrestre tti = new Motocicleta(capacidade, modelo, anoFabricacao, getColorFromString(cor), rodas);
                        TT.add(tti);
                    } else {
                        System.out.println("Nenhum tipo válido! ");
                        break;
                    }
                    break;

                case "aereo":
                    System.out.println("Insira a capacidade: ");
                    capacidade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o modelo do veículo: ");
                    modelo = sc.nextLine();
                    System.out.println("Insira o ano de fabricação do veículo: ");
                    anoFabricacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira a cor do veículo: ");
                    cor = sc.nextLine();
                    cor.toLowerCase();
                    System.out.println("Insira o número de rodas do veículo: ");
                    rodas = sc.nextInt();
                    System.out.println("Insira o peso do veículo: ");
                    peso = sc.nextDouble();

                    TransporteAereo taa = new Aviao(capacidade, modelo, anoFabricacao, getColorFromString(cor), rodas, peso);
                    TA.add(taa);
                    break;

                case "maritimo":
                    System.out.println("Insira a capacidade: ");
                    capacidade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o modelo do veículo: ");
                    modelo = sc.nextLine();
                    System.out.println("Insira o ano de fabricação do veículo: ");
                    anoFabricacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira a cor do veículo: ");
                    cor = sc.nextLine();
                    cor.toLowerCase();
                    System.out.println("Insira a velocidade máxima do veículo: ");
                    double velocidadeMaxima = sc.nextDouble();

                    TransporteMaritimo tmm = new Barco(capacidade, modelo, anoFabricacao, getColorFromString(cor), velocidadeMaxima);
                    TM.add(tmm);
                    break;
            }
            sc.nextLine();
            System.out.println("Deseja continuar? S / N");
            continuar = sc.nextLine();

        } while (!continuar.equalsIgnoreCase("N"));

        System.out.println("\n Veículos Terrestres:");
        for (TransporteTerrestre veiculoTerrestre : TT) {
            System.out.println(veiculoTerrestre);
        }

        System.out.println("\n Veículos Aéreos:");
        for (TransporteAereo veiculoAereo : TA) {
            System.out.println(veiculoAereo);
        }

        System.out.println("\n Veículos Marítimos:");
        for (TransporteMaritimo veiculoMaritimo : TM) {
            System.out.println(veiculoMaritimo);
        }

    }

    private static Color getColorFromString(String corString) {
        switch (corString.toLowerCase()) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
            case "black":
                return Color.BLACK;
            case "white":
                return Color.WHITE;
            case "yellow":
                return Color.YELLOW;
            case "cyan":
                return Color.CYAN;
            case "magenta":
                return Color.MAGENTA;
            default:
                System.out.println("Cor não reconhecida. Usando GRAY como padrão.");
                return Color.GRAY;
        }
    }

}
