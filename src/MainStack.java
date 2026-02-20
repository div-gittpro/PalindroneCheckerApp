public class MainStack {
    public static void main(String[] args) {
        String[] tests = {"racecar", "palindrome", "", "a", "abba", "abca", null};
        for (String t : tests) {
            boolean result = (t == null) ? false : PalindromeCheckerStack.isPalindromeStack(t);
            System.out.printf("%s -> %b%n", String.valueOf(t), result);
        }
    }
}
