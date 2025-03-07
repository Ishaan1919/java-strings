import java.util.Scanner;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.close();
        
        // generateException(names, index);
        handleException(names, index);
    }

    public static void generateException(String[] names, int index) {
        System.out.println(names[index]); // This will cause ArrayIndexOutOfBoundsException
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }
}
