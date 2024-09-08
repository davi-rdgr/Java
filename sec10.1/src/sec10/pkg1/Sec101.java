package sec10.pkg1;

import java.util.Locale;
import java.util.Scanner;

public class Sec101 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número do vetor posição " + i);
            vect[i] = sc.nextDouble();
        }

        for (double i : vect) {
            System.out.println(i);
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.println(avg);

        sc.close();
    }

}