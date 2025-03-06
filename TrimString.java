import java.util.Scanner;

public class TrimString {
    
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }
    
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string with spaces: ");
        String userInput = input.nextLine();
        
        int[] indices = findTrimIndices(userInput);
        String trimmedCustom = customSubstring(userInput, indices[0], indices[1]);
        String trimmedBuiltIn = userInput.trim();
        
        System.out.println("Trimmed String (Custom Method): " + trimmedCustom);
        System.out.println("Trimmed String (Built-in Method): " + trimmedBuiltIn);
        
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both strings equal? " + isEqual);
        
        input.close();
    }
}
