import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        
        System.out.print("Enter the subString: ");
        String substr = input.nextLine();

        int res = substringOccurrences(s,substr);
        System.out.println("The Substring " + substr + " Occurs " + res + " times in the string " + s);
        input.close();
    }

    public static int substringOccurrences(String s, String sub){
        int len = s.length();
        int sublen = sub.length();
        char first = sub.charAt(0);
        int res = 0;
        for(int i=0;i<len-sublen+1;i++){
            char c = s.charAt(i);
            if(c == first && s.substring(i, i+sublen).equals(sub)){
                res++;
            }
        }
        return res;
    }
}