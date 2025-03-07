import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean result = checkPalindrome(s);
        if(result){
            System.out.println("The String " + s + " is a palindrome");
        }
        else{
            System.out.println("The String " + s + " is not a palindrome");
        }
        input.close();
    }
    public static boolean checkPalindrome(String s) {
        int len = s.length();
        int i=0;
        int j=len-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
