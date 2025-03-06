import java.util.Scanner;

public class VowelConsonantTable {
    
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    
    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }
    
    public static void displayTable(String[][] table) {
        System.out.println("Character  Type");
        for (String[] row : table) {
            System.out.printf("   %s       %s\n", row[0], row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        
        String[][] classification = classifyCharacters(userInput);
        
        displayTable(classification);
        
        input.close();
    }
}
