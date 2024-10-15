package sec14.pkg4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sec144 {

    // criando um arquivo na área de trabalho com 3 strings dentro
    
    public static void main(String[] args) throws IOException {
        String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good night"};

        String path = "C:\\Users\\PC\\Desktop\\oaaaa.txt";

        // true para afirmar que não quero recriar o arquivo, sim acrescentar as string novamente
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
