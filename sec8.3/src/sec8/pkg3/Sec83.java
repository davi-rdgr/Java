package sec8.pkg3;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Sec83 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Entre com a largura do retângulo: ");
        rectangle.width = sc.nextDouble();
        System.out.println("Entre com a altura do retângulo: ");
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.toString());

    }

}
