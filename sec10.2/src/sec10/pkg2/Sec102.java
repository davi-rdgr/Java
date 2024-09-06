package sec10.pkg2;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Sec102 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de novos produtos: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nome do produto " + i);
            String name = sc.nextLine();
            System.out.println("Valor do produto " + i);
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("Avarage price: %.2f%n ", avg);
        sc.close();
    }

}
