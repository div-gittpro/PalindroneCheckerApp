# PalindroneCheckerApp

This small app demonstrates UC4: Character Array Based Palindrome Check.

**Key idea (UC4)**: convert a string to a `char[]` and use a two-pointer approach
to compare characters from the start and end, returning false on the first mismatch.

Files added:
- `src/PalindromeChecker.java`: contains `isPalindrome(String)` using `char[]` and two pointers.
- `src/Main.java`: simple runner that prints results for example inputs.

Quick build & run (Windows):

```powershell
cd PalindroneCheckerApp
javac -d out src\*.java
java -cp out Main
```

This prints each test string and whether it's a palindrome according to UC4.
# PalindroneCheckerApp