import java.util.Scanner;

public class CompareCharArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string1: ");
        String str1 = input.next();

        System.out.print("Enter the string2: ");
        String str2 = input.next();

        char[] charArray1 = getArray(str1);
        char[] charArray2 = getArrayInbuilt(str2);
        if(compareArrays(charArray1,charArray2)){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.print("Both the arrays are not equal");
        }
        System.out.println(charArray1);
        input.close();
    }

    public static char[] getArray(String str){
        int size = str.length();
        char[] array = new char[size];
        for(int i=0;i<size;i++){
            array[i] = str.charAt(i);
        }
        return array;
    }
    public static char[] getArrayInbuilt(String str){
        return str.toCharArray();
    }
    public static boolean compareArrays(char[] array1, char[] array2){
        int size1 = array1.length;
        int size2 = array2.length;
        if(size1 != size2) return false;

        for(int i=0;i<size1;i++){
            if(array1[i] != array2[i]) return false;
        }
        return true;
    }
}