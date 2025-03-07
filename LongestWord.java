import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        String res = getLongestWord(s);
        System.out.println("The longest word in the string is " + res);
        input.close();
    }
    public static String getLongestWord(String s){
        int len = s.length();
        String res = "";
        String temp = "";
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c == ' '){
                if(s.compareTo(temp)>0){
                    res = temp;
                }
                temp = "";
            }
            else{
                temp += c;
            }
        }
        if(s.compareTo(temp)>0) res = temp;
        return res;
    }
}
