package sec13.pkg4;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sec134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> Product = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int pNumber = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < pNumber; i++) {
            System.out.println("Product #" + (i + 1) + " data:");

            System.out.println("Common, used or imported? (c / u / i): ");
            String resp = sc.nextLine();

            if (resp.equalsIgnoreCase("c")) {
                System.out.println("Nome: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                Product product = new Product(name, price);
                Product.add(product);
            } else if (resp.equalsIgnoreCase("u")) {
                System.out.println("Nome: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Manufacture date: (DD/MM/YYYY): ");
                String dateStr = sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(dateStr, formatter);
                UsedProduct used = new UsedProduct(name, price, manufactureDate);
                Product.add(used);
            } else {
                System.out.println("Nome: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Customs fee: ");
                double customs = sc.nextDouble();
                sc.nextLine();

                ImportedProduct imported = new ImportedProduct(name, price, customs);
                Product.add(imported);
            }
        }
        System.out.println("\n Product list: ");
        for(Product p : Product) {
            System.out.println(p.priceTag());
        }
    }

}
