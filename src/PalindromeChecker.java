public class PalindromeChecker {
<<<<<<< HEAD
    public static void main(String[] args) {
<<<<<<< HEAD
        String word = "madam"; // hardcoded string to check
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
=======
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
>>>>>>> UC3
        }
=======
    /**
     * UC4: Character Array Based Palindrome Check
     * Converts the input string to a char[] and compares with two-pointer technique.
     * Time complexity: O(n), Space: O(n) for the char array (avoids extra objects per comparison).
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) return false;
            i++; j--;
        }
        return true;
>>>>>>> UC4
    }
}
