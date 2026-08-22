import java.util.Scanner;

class Ride {
    int number;
    String name;

    Ride(int number, String name) {
        this.number = number;
        this.name = name;
    }

    void displayPattern() {
        System.out.printf("%-15s : ", name);
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public class week4qs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ride[] rides = new Ride[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ride " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Activity Level (1-5): ");
            int number = sc.nextInt();
            sc.nextLine(); // Clear buffer

            rides[i] = new Ride(number, name);
            System.out.println();
        }

        System.out.println("--- Output ---");
        for (int i = 0; i < rides.length; i++) {
            rides[i].displayPattern();
        }

        sc.close();
    }
}