import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();
    
        char[][] frequencies = findCharacterFrequencies(text);
        
        // Display character frequencies
        System.out.println("Character Frequencies:");
        for (char[] row : frequencies) {
            System.out.println(row[0] + " : " + (int) row[1]);
        }

        // Enter a string: ishaan
        // Character Frequencies:
        // a : 2
        // h : 1
        // i : 1
        // n : 1
        // s : 1
    }

    public static char[][] findCharacterFrequencies(String text) {
        int[] freq = new int[256];
        int len = text.length();

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        char[][] result = new char[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = (char) i;
                result[index][1] = (char) freq[i];
                index++;
            }
        }
        
        return result;
    }

}
