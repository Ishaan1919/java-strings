import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        String res = "";
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            res += s.charAt(i);
        }
        System.out.println("Reverse of String " + s + " is " + res);
        input.close();
    }
}
