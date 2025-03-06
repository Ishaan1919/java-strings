import java.util.Scanner;

public class GetSubstring{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String string = input.next();
        
        System.out.println("Enter the start index");
        int startIndex = input.nextInt();

        System.out.println("Enter the end index");
        int endIndex = input.nextInt();
        
        int size = string.length();

        if(startIndex < 0 || endIndex > size || startIndex > endIndex){
            System.out.println("Invalid Start or end index");
            input.close();
            return ;
        }

        String substr1 = getSubstring(string,startIndex,endIndex);
        String substr2 = getSubstringUsingInbuiltFunction(string,startIndex,endIndex);

        if(substr1.equals(substr2)){
            System.out.println("The substrings " + substr1 + " are same for both the functions");
        }
        else{
            System.out.println("There is some logical error");
            System.out.println(substr1 + " " + substr2);
        }

        input.close();
    }
    
    public static String getSubstring(String str, int start, int end){
        String substr = "";
        for(int i=start;i<end;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    public static String getSubstringUsingInbuiltFunction(String str, int start, int end){
        return str.substring(start,end);
    }
}