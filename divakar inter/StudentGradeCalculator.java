import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        // Take marks of each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();

            totalMarks = totalMarks + marks;
        }

        // Calculate average percentage
        double percentage = (double) totalMarks / subjects;

        // Calculate grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}