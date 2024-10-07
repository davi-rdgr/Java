package sec13.pkg3;

import entities.Employee;
import entities.OutSourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sec133 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Employee> employee = new ArrayList<>();
        List<Employee> outEmployee = new ArrayList<>();

        System.out.println("Enter the number of Employees: ");
        int numEmployes = sc.nextInt();

        for (int i = 0; i < numEmployes; i++) {
            sc.nextLine();
            System.out.println("\n Employee #" + (i + 1) + "data: \n");
            System.out.println("Outsourced? (y/n)");
            String outs = sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Hours: ");
            int hours = sc.nextInt();

            System.out.println("Value per Hours: ");
            double valueph = sc.nextDouble();

            if (outs.equalsIgnoreCase("n")) {
                Employee emp = new Employee(name, hours, valueph);
                employee.add(emp);
                
            } else {
                System.out.println("Additional charge: ");
                double adtCharge = sc.nextDouble();
                OutSourcedEmployee outemp = new OutSourcedEmployee(name, hours, valueph, adtCharge);
                outEmployee.add(outemp);
            }
        }
        System.out.println("Employee:");
        for(Employee e : employee) {
            System.out.println(e.getName());
            System.out.println(e.Payment());
        }
        
        System.out.println("Outsourced Employee:");
        for(Employee e : outEmployee) {
            System.out.println(e.getName());
            System.out.println(e.Payment());
        }
        
    }

}
