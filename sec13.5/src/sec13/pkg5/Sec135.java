package sec13.pkg5;

import entities.Shape;
import entities.enums.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Rectangle;
import entities.Circle;

public class Sec135 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");

        int n = Sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");

            System.out.println("Rectangle or Circle? (r / c)");
            char ch = Sc.next().charAt(0);

            System.out.println("Color? BLACK, BLE, RED");
            Color color = Color.valueOf(Sc.next());

            if (ch == 'r') {
                System.out.println("Width: ");
                double width = Sc.nextDouble();

                System.out.println("Height: ");
                double height = Sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            } else {
                System.out.println("Radius: ");
                double radius = Sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println("");
        System.out.println("SHAPE AREAS:");

        for (Shape shape : list) {
            System.out.println(shape.area());
        }

        Sc.close();
    }

}
