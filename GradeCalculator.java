import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from user input
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();
        return score;
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(double score) {
  
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
    }
}
