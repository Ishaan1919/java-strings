import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String s = input.nextLine();
        System.out.print("Enter the string 2 : ");
        String t = input.nextLine();
        String[] res = compareStrings(s,t);
        System.out.println(res[0] + " comes before " + res[1] + " in lexicographical order");
        input.close();
    }

    public static String[] compareStrings(String s, String t){
        int len1 = s.length();
        int len2 = t.length();
        for(int i=0;i<Math.min(len1, len2);i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(c1<c2){
                return new String[]{s,t};
            }
            else if(c2<c1){
                return new String[]{t,s};
            }
        }
        if(len1<len2) return new String[]{s,t};
        return new String[]{t,s};
    }
}