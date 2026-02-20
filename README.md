# PalindroneCheckerApp

UC3: Palindrome Check Using String Reverse

Goal: Check whether a string is a palindrome by reversing it.

Implementation:
- Reverses the input string using a `for` loop and string concatenation.
- Compares the original and reversed strings using `equals()`.
- Prints the original string, reversed string, and the result.

Files:
- `src/PalindromeChecker.java` — Java implementation for UC3.

Compile & Run

Using command line with Java installed:

Compile:
```powershell
javac src/PalindromeChecker.java
```

Run (argument mode):
```powershell
java -cp src PalindromeChecker madam
```

Run (interactive stdin):
```powershell
java -cp src PalindromeChecker
# then type a string and press Enter
```

Notes
- This implementation demonstrates string immutability and uses `+` concatenation to build the reversed string (not optimal for large inputs).
