public class NullPtrException {
    public static void main(String[] args) {
        // generateException();
        handleException();
    }

    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will cause a NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Attempted to access a method on a null object.");
        }
    }
}
