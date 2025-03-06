import java.util.Scanner;

public class ToLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = input.next();

        String lowerCaseString1 = getLowercase(str);
        String lowerCaseString2 = getLowercaseInbuilt(str);

        if(lowerCaseString1.equals(lowerCaseString2)){
            System.out.print("Both the functions are working fine to convert upper case to lower case: " + lowerCaseString1);
        }
        else{
            System.out.println("Both the strings are different, there is some logical mistake");
        }
        input.close();
    }

    public static String getLowercaseInbuilt(String str){
        return str.toLowerCase();
    }
    public static String getLowercase(String str){
        String result = "";
        int size = str.length();
        for(int i=0;i<size;i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                result += (char)(c+32);
            }
            else result += c;
        }
        return result;
    }
}