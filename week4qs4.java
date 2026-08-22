import java.util.Scanner;

class Patient {
    String name;
    double fee;

    Patient(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    double calculateFinalAmount(double fee) {
        double discount = (fee >= 2000) ? fee * 0.10 : fee * 0.05;
        return fee - discount;
    }

    void displayBill() {
        double discount = (fee >= 2000) ? fee * 0.10 : fee * 0.05;
        double finalAmount = calculateFinalAmount(fee);
        System.out.println("Patient Name: " + name);
        System.out.println("Original Fee: rs" + fee);
        System.out.println("Discount: rs" + discount);
        System.out.println("Final Amount: rs" + finalAmount);
        System.out.println();
    }
}

public class week4qs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();
            patients[i] = new Patient(name, fee);
        }

        System.out.println("\n--- Hospital Billing Summary ---");
        for (int i = 0; i < 5; i++) {
            patients[i].displayBill();
        }
        sc.close();
    }
}