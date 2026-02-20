public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "madam"; // hardcoded string to check
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
