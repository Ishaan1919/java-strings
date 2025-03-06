import java.util.Scanner;

public class CompareStrings{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = input.next();
        
        System.out.print("Enter the second string: ");
        String string2 = input.next();
        
        boolean result1 = compareStrings(string1, string2);
        boolean result2 = compareStringsUsingInbuiltFunction(string1, string2);

        if(result1==result2){
            System.out.println("Both the functions are giving the same result");
        }
        else{
            System.out.println("Both the functions are not giving the same result");
        }

        input.close();
    }
    
    public static boolean compareStrings(String str1, String str2){
        int str1Length = str1.length();
        int str2Length = str2.length();
        if(str1Length!=str2Length) return false;
        for(int i=0;i<str1Length;i++){
            if(str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static boolean compareStringsUsingInbuiltFunction(String str1, String str2){
        return str1.equals(str2);
    }
}