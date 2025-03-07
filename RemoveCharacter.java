import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();

        System.out.print("Enter the character you want to remove from the string: ");
        char c = input.next().charAt(1);
        String res = removeCharacter(s,c);
        System.out.println("The String after removal of character " + c + "is: " + res);
        input.close();
    }

    public static String removeCharacter(String s, char c){
        int len = s.length();
        String res = "";
        for(int i=0;i<len;i++){
            char curr = s.charAt(i);
            if(curr != c){
                res += curr;
            }
        }
        return res;
    }
}