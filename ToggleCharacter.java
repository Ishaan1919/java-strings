import java.util.Scanner;

public class ToggleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = input.nextLine();
        String res = toggleCharacter(s);
        System.out.println("String after toggle is: " + res);
        input.close();
    }
    public static String toggleCharacter(String s){
        String res = "";
        int len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                res += Character.toUpperCase(c);
            }
            else if(c>='A' && c<='Z'){
                res += Character.toLowerCase(c);
            }
        }
        return res;
    }
}
