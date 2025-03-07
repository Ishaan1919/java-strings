import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = input.nextLine();
        System.out.print("Enter second string: ");
        String text2 = input.nextLine();
        input.close();
        
        boolean isAnagram = checkAnagram(text1, text2);
        System.out.println("Anagram Check: " + isAnagram);

        // Enter first string: ishaan
        // Enter second string: naashi 
        // Anagram Check: true
    }

    public static boolean checkAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
            frequency[text2.charAt(i)]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
