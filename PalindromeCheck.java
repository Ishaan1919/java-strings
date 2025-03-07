import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();
        
        boolean isPalindrome1 = checkPalindromeIterative(text);
        boolean isPalindrome2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = checkPalindromeUsingArray(text);
        
        System.out.println("Palindrome Check (Iterative): " + isPalindrome1);
        System.out.println("Palindrome Check (Recursive): " + isPalindrome2);
        System.out.println("Palindrome Check (Using Array): " + isPalindrome3);

        // Enter a string: hello olleh
        // Palindrome Check (Iterative): true  
        // Palindrome Check (Recursive): true  
        // Palindrome Check (Using Array): true
    }

    public static boolean checkPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean checkPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
}
