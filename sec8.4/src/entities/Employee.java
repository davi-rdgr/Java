package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
    percentage = percentage / 100;
    grossSalary = grossSalary * (1 + percentage);
}

    public String toString() {
        return "Nome: " + name + " salário bruto: " + grossSalary + " salário com impostos: " + netSalary();
    }
}
