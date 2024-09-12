package sec10.pkg9;

import java.util.Scanner;

public class Sec109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //instanciando a matriz:
        int[][] mat = new int[n][n];

        // completando valores da matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + "");
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }
        
        System.out.println("\n Numeros negativos: " + count);
    }

}
