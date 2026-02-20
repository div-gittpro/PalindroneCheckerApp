public class PalindromeChecker {
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
    }
}
