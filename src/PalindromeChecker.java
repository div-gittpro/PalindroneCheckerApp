public class PalindromeChecker {
    public static void main(String[] args) {
        String input;
        if (args.length > 0) {
            input = String.join(" ", args);
        } else {
            System.out.println("Enter a string to check for palindrome:");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            input = sc.nextLine();
            sc.close();
        }

        String original = input;
        String reversed = "";

        // Reverse string using a for loop (character-by-character concatenation)
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Compare using equals() to check content equality
        if (original.equals(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a palindrome");
        }
    }
}
