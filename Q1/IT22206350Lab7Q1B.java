import java.util.Scanner;

public class IT22206350Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            double total = 0;

            // Read four marks typed on one line, separated by spaces
            for (int i = 1; i <= 4; i++) {
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

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);

            if (student < 3) {
                System.out.println();
            }
        }
    }
}
