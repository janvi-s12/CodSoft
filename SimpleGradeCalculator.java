import java.util.Scanner;

public class SimpleGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define number of subjects
        int numSubjects = 4;
        double totalMarks = 0;
        
        // Input: Marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            totalMarks += scanner.nextDouble();
        }
        
        // Calculate Average Percentage
        double averagePercentage = totalMarks / numSubjects;
        
        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display Results
        System.out.printf("\nTotal Marks: %.2f\n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
