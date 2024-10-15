package sec14.pkg2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sec142 {

    // lendo um txt da área de trabalho
    
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PC\\Desktop\\opa.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

}
