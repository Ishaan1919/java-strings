import java.util.Scanner;

public class ToUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = input.next();

        String upperCaseString1 = getUppercase(str);
        String upperCaseString2 = getUppercaseInbuilt(str);

        if(upperCaseString1.equals(upperCaseString2)){
            System.out.print("Both the functions are working fine to convert lower case to upper case: " + upperCaseString1);
        }
        else{
            System.out.println("Both the strings are different, there is some logical mistake");
        }
    }

    public static String getUppercaseInbuilt(String str){
        return str.toUpperCase();
    }
    public static String getUppercase(String str){
        String result = "";
        int size = str.length();
        for(int i=0;i<size;i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                result += (char)(c-32);
            }
            else result += c;
        }
        return result;
    }
}