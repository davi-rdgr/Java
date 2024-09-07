package sec10.pkg4;

import java.util.Locale;
import java.util.Scanner;

public class Sec104 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        double[] nums = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            nums[i] = sc.nextDouble();
        }

        System.out.println("VALORES:");

        for (double abc : nums) {
            System.out.println(abc);
        }

        System.out.println("SOMA:");

        double val = 0;
        for (double abc : nums) {
            val = val + abc;
        }
        System.out.println(val);

        System.out.println("MEDIA:");
        
        val = 0;
        double med = 0;
        for (double abc : nums) {
            val = val + abc;
        }

        med = val / n;
        System.out.println(med);
    }

}
