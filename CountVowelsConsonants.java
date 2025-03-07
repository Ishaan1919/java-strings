import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        int[] count = countVowelsConsonants(s);
        System.out.println("Number of Vowels are: " + count[0]);
        System.out.println("Number of Consonants are: " + count[1]);
        input.close();
    }

    public static int[] countVowelsConsonants(String s){
        int len = s.length();
        int[] res = new int[2];
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                res[0]++;
            }
            else if(c != ' '){
                res[1]++;
            }
        }
        return res;
    }
}