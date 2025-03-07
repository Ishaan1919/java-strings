import java.util.Scanner;

public class IndexOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();
        
        // generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // This will cause StringIndexOutOfBoundsException
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Attempted to access an invalid index in the string.");
        }
    }
}
