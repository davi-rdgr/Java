package trafegoaereo;

import entities.Aviao;
import entities.Piloto;
import entities.Voo;
import entities.Torre;

public class TrafegoAereo {

    public static void main(String[] args) {

        Aviao aviao1 = new Aviao(101, "Embraer", "em solo", 300);
        Aviao aviao2 = new Aviao(102, "Gol", "em solo", 150);
        Aviao aviao3 = new Aviao(103, "Azul", "em solo", 200);

        System.out.println(aviao1.toString());
        System.out.println(aviao2.toString());
        System.out.println(aviao3.toString());

        Piloto piloto1 = new Piloto("Jorge", 44, 5533346, "Embraer");
        Piloto piloto2 = new Piloto("Amaral", 24, 33422553, "Gol");
        Piloto piloto3 = new Piloto("Josefino", 67, 33422667, "Azul");

        System.out.println(piloto1.toString());
        System.out.println(piloto2.toString());
        System.out.println(piloto3.toString());

        Voo voo1 = new Voo("São Paulo", "Rio de Janeiro", 1, 101, aviao1, piloto1);
        Voo voo2 = new Voo("Porto Alegre", "Teresina", 2, 102, aviao2, piloto2);
        Voo voo3 = new Voo("Teresina", "Curitiba", 4, 103, aviao3, piloto3);

        System.out.println(voo1.exibirRota());
        System.out.println(voo2.exibirRota());
        System.out.println(voo3.exibirRota());

        Torre torre = new Torre();


        //adicionar aviões nas filas
        torre.adicionarFilaPouso(aviao1);
        torre.adicionarFilaDecolagem(aviao2);

        //autorizar pouso e decolagem:
        torre.autorizarDecolagem();
        torre.autorizarPouso();

        //exibir aviões no espaço aéreo
        torre.exibirEspacoAereo();
    }

}
