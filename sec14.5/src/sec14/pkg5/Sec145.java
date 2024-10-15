package sec14.pkg5;

import java.io.File;
import java.util.Scanner;

public class Sec145 {

    public static void main(String[] args) {

        // listando pastas de um diretório: 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the folder path: ");

        String str = sc.nextLine();

        File path = new File(str);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }
        
        boolean success = new File(str + "\\ subdir").mkdir();
        System.out.println("Diretório criado com suceddo: " + success);
        sc.close();
    }

}
