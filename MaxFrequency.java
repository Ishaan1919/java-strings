import java.util.Scanner;

public class MaxFrequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        char c = maxFrequency(s);
        System.out.println("The most frequent character is: " + c);
        input.close();
    }
    public static char maxFrequency(String s){
        int len = s.length();
        char c = s.charAt(0);
        int max =  0;
        for(int i=0;i<len;i++){
            int cnt = 0;
            char a = s.charAt(i);
            for(int j=0;j<len;j++){
                if(a==s.charAt(j)) cnt++;
            }
            if(cnt>max){
                max = cnt;
                c = a;
            }
        }
        return c;
    }
}