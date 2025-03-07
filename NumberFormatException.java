import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = scanner.nextLine();
        scanner.close();
        
        // generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text)); // This will cause NumberFormatException
    }

    public static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (Exception e) {
            System.out.println("NumberFormatException caught: Input is not a valid number.");
        }
    }
}
