import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        
        displayScorecard(scores, results, grades);
        
        input.close();
    }
    
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100);
            scores[i][1] = random.nextInt(100);
            scores[i][2] = random.nextInt(100);
        }
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(total/3.0);
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0;
            results[i][2] = percentage;
        }
        return results;
    }
    
    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i] = "A";
            else if (percentage >= 80) grades[i] = "B";
            else if (percentage >= 70) grades[i] = "C";
            else if (percentage >= 60) grades[i] = "D";
            else if (percentage >= 50) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("   %d    |   %3d   |   %3d    |  %3d |  %3.0f  |   %5.2f  |   %6.0f%%  |  %s\n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}
