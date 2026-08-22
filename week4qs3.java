import java.util.Scanner;

class Employee {
    int id;
    String name;
    double monthlySalary;

    Employee(int id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    boolean isEligibleForBonus() {
        return monthlySalary >= 30000;
    }

    double calculateBonus() {
        return isEligibleForBonus() ? calculateAnnualSalary() * 0.10 : 0.0;
    }

    void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
        System.out.println("Annual Salary: ₹" + calculateAnnualSalary());
        System.out.println("Bonus Eligibility: " + (isEligibleForBonus() ? "Eligible" : "Not Eligible"));
        System.out.println("Bonus Amount: ₹" + calculateBonus());
        System.out.println();
    }
}

public class week4qs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\n--- Employee Summary ---");
        for (int i = 0; i < 5; i++) {
            employees[i].displayDetails();
        }
        sc.close();
    }
}