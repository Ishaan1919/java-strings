import java.util.Scanner;

public class SplitArrayLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        // String str = input.nextLine();
        String str = "Hello world my name is ishaan";

        String[] splitArray1 = splitString(str);
        String[][] arrayWithLen = storeIn2DArray(splitArray1);
        print(arrayWithLen);
        
        // Enter the string: Both the arrays are not same, there is some logical mistake
        // Hello_world_my_name_is_ishaan_
        // Hello_world_my_name_is_ishaan_
    }

    public static void print(String[][] arr){
        System.out.println("Word\tLength");
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.printf("%s\t%s\n",arr[i][0],arr[i][1]);
        }
        System.out.println();
    }

    public static String[][] storeIn2DArray(String[] arr){
        int len = arr.length;
        String[][] result = new String[len][2];
        for(int i=0;i<len;i++){
            String str = arr[i];
            result[i][0] = str;
            result[i][1] = String.valueOf(str.length());
        }
        return result;
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