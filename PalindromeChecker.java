public class PalindromeChecker {
    public static final String APP_NAME = "Palindrome Checker";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        printWelcome();

        // Next use case or application logic would run here.
        // For UC1 we only display the welcome message and app details.
    }

    private static void printWelcome() {
        System.out.println("===============================================");
        System.out.println("\t" + APP_NAME + " - Welcome!");
        System.out.println("\tVersion: " + VERSION);
        System.out.println();
        System.out.println("This application checks whether input strings are palindromes.");
        System.out.println("Press Ctrl+C to exit or run the next use case.");
        System.out.println("===============================================");
    }
}
