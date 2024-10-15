package sec14.pkg3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sec143 {

    public static void main(String[] args) {
        
        // abrindo e fechando manualmente as strings
        
        String path = "C:\\Users\\PC\\Desktop\\opa.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }

