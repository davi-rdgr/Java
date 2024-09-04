package sec8.pkg4;

import java.util.Scanner;
import entities.Employee;
import java.util.Locale;

public class Sec84 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Insira o nome: ");
        employee.name = sc.nextLine();
        System.out.println("Insira o salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Insira o valor do imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee.toString());

        System.out.println("Qual a porcentagem que deseja acrescentar? ");
        double porcentagem = sc.nextDouble();

        employee.increaseSalary(porcentagem);

        System.out.println(employee.toString());
    }

}
