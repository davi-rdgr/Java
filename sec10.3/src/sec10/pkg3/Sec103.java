package sec10.pkg3;

import java.util.Locale;
import java.util.Scanner;

public class Sec103 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce irá inserir? ");
        int n = sc.nextInt();
        double[] nums = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            nums[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                System.out.println(nums[i]);
            }
        }
    }

}
