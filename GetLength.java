import java.util.Scanner;

public class GetLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = input.next();
        int size = getLength(str);
        System.out.println("The size of the string " + str + " is -> " + size);
        input.close();

        // Enter the string: ishaan
        // The size of the string ishaan is -> 6
    }

    public static int getLength(String str){
        int size = 0;
        try{
            while(true){
                str.charAt(size);
                size++;
            }
        }
        catch(IndexOutOfBoundsException e){
            // index of the string exceded the length of the string
        }
        return size;
    }
}