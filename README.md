# PalindroneCheckerApp

This small app demonstrates UC4 (char[] two-pointer) and UC5 (stack-based) palindrome checks.

**UC5 Key idea**: push characters into a stack (LIFO), then pop and compare to the original
sequence to validate if the string is a palindrome.

Files added for UC5:
- `src/PalindromeCheckerStack.java`: implements stack-based `isPalindromeStack(String)`.
- `src/MainStack.java`: simple runner that prints results for example inputs using the stack method.

Quick build & run (Windows PowerShell) — compiles both checkers and runs both runners:

```powershell
cd PalindroneCheckerApp
javac -d out src\*.java
java -cp out Main
java -cp out MainStack
```

# PalindroneCheckerApp