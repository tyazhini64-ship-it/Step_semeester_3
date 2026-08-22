import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double[] marks = new double[3];
    double attendance;

    Student(int rollNo, String name, double[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / marks.length;
    }

    void display() {
        double avg = calculateAverage();
        String result = (avg >= 50) ? "Pass" : "Fail";
        String scholarship = (avg >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String performance = (avg >= 85) ? "Excellent" : "Good";

        System.out.println("Roll No: " + rollNo + " | Name: " + name);
        System.out.println("Total Marks: " + calculateTotal() + " | Average: " + avg);
        System.out.println("Result: " + result + " | Scholarship: " + scholarship + " | Performance: " + performance);
        System.out.println();
    }
}

public class week4qs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            double[] marks = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }
            System.out.print("Attendance %: ");
            double att = sc.nextDouble();
            students[i] = new Student(roll, name, marks, att);
        }

        System.out.println("\n--- Student Details ---");
        int topIndex = 0;
        for (int i = 0; i < 5; i++) {
            students[i].display();
            if (students[i].calculateAverage() > students[topIndex].calculateAverage()) {
                topIndex = i;
            }
        }

        System.out.println("Top Performing Student: " + students[topIndex].name + " (Avg: " + students[topIndex].calculateAverage() + ")");
        sc.close();
    }
}