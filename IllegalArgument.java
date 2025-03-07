import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();
        
        // generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // This will cause IllegalArgumentException
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        }
    }
}
