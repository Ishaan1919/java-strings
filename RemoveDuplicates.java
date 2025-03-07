import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        String res = removeDuplicates(s);
        System.out.println("String after removing the duplicates are: " + res);
        input.close();
    }

    public static String removeDuplicates(String s){
        String res = "";
        int len = s.length();
        for(int i=0;i<len;i++){
            int cnt = 0;
            char c = s.charAt(i);
            for(int j=0;j<len;j++){
                if(c == s.charAt(j)) cnt++;
            }
            if(cnt==1) res+=c;
        }
        return res;
    }
}