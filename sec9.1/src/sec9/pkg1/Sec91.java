package sec9.pkg1;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Sec91 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computaria");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());
        
        
        System.out.println("");
        System.out.println("Product data: " + product.toString());

        System.out.println("Enter the number of products to be addead in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: " + product.toString());

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: " + product.toString());

        sc.close();

    }

}
