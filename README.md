# PalindroneCheckerApp

## UC2 — Print Hardcoded Palindrome Result

This small Java program checks a hardcoded string and prints whether it's a palindrome.

### Run
 - Compile:
	 ```
	 javac src/PalindromeChecker.java
	 ```
 - Run:
	 ```
	 java -cp src PalindromeChecker
	 ```

# PalindroneCheckerApp

This repository contains small Java examples demonstrating different palindrome-check approaches (UC2, UC4, UC5).

## UC2 — Print Hardcoded Palindrome Result

Simple program that checks a hardcoded string and prints whether it's a palindrome.

### Run UC2

- Compile:

```powershell
javac -d out src\PalindromeChecker.java
```

- Run:

```powershell
java -cp out PalindromeChecker
```

## UC4 — Character Array Based Palindrome Check

Key idea: convert a string to a `char[]` and use a two-pointer approach to compare characters from both ends.

Files:
- `src/PalindromeChecker.java` — `isPalindrome(String)` using `char[]` and two pointers.
- `src/Main.java` — runner demonstrating UC4.

### Run UC4

```powershell
javac -d out src\*.java
java -cp out Main
```

## UC5 — Stack-Based Palindrome Checker

Key idea: push characters into a `Stack` (LIFO), then pop and compare to validate palindrome.

Files:
- `src/PalindromeCheckerStack.java` — `isPalindromeStack(String)` using a stack.
- `src/MainStack.java` — runner demonstrating UC5.

### Run UC5

```powershell
javac -d out src\*.java
java -cp out MainStack
```

---

Merge note: This `README.md` was updated to resolve a merge conflict (kept UC2 content and added UC4/UC5 documentation).
