import java.util.Scanner;

public class IT22206350Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;

        System.out.println("Enter marks for four subjects:");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            double mark = input.nextDouble();
            total = total + mark;
        }

        double average = total / 4;

        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);
    }
}
