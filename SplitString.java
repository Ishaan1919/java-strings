import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        // String str = input.nextLine();
        String str = "Hello world my name is ishaan";

        String[] splitArray1 = splitString(str);
        String[] splitArray2 = splitString(str);

        if(compare(splitArray1,splitArray2)){
            System.out.println("Both the arrays are same");
            print(splitArray1);
        }
        else{
            System.out.println("Both the arrays are not same, there is some logical mistake");
        }
        print(splitArray1);
        print(splitArray2);
        
        // Enter the string: Both the arrays are not same, there is some logical mistake
        // Hello_world_my_name_is_ishaan_
        // Hello_world_my_name_is_ishaan_
    }

    public static void print(String[] arr){
        for(String s : arr){
            System.out.print(s + '_');
        }
        System.out.println();
    }
    
    public static boolean compare(String[] arr1, String[] arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;
        if(size1!=size2) return false;
        for(int i=0;i<size1;i++){
            if(arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    
    public static String[] splitStringInbuilt(String str){
        return str.split(" ");
    }
    
    public static String[] splitString(String str){
        int size = str.length();
        int wordsCount = 1;
        for(int i=0;i<size;i++){
            if(str.charAt(i)==' ') wordsCount++;
        }
        String[] result = new String[wordsCount];
        int index = 0;
        String tempStr = "";
        for(int i=0;i<size;i++){
            char c = str.charAt(i);
            if(c == ' '){
                result[index++] = tempStr;
                tempStr = "";
            }
            else tempStr += c;
        }
        result[index] = tempStr;
        return result;
    }
}