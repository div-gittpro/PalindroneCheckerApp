import java.util.Stack;

public class PalindromeCheckerStack {
    /**
     * UC5: Stack-Based Palindrome Checker
     * Pushes characters into a stack, then pops and compares to validate palindrome.
     * Time complexity: O(n), Space: O(n) for the stack.
     */
    public static boolean isPalindromeStack(String s) {
        if (s == null) return false;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) stack.push(c);
        for (char c : chars) {
            if (stack.pop() != c) return false;
        }
        return true;
    }
}
