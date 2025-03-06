import java.util.Random;
import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[] ages = generateAges(numStudents);
        String[][] votingResults = checkVotingEligibility(ages);
        
        displayTable(votingResults);
        
        input.close();
    }
    
    public static int[] generateAges(int numStudents) {
        Random random = new Random();
        int[] ages = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            ages[i] = random.nextInt(82);
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }
    
    public static void displayTable(String[][] table) {
        System.out.println("Age  Voting Eligibility");
        for (String[] row : table) {
            System.out.printf("%3s  %s\n", row[0], row[1]);
        }
    }
    
}
