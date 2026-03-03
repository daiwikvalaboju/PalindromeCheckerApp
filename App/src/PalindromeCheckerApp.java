public class PalindromeCheckerApp {
    static void main() {
                System.out.println("Welcome to Palindrome Checker");
                System.out.println("Version 1.0");
                System.out.println("System Initialised");

                String input = "tenet";
                String reversed = "";
                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed = reversed + input.charAt(i);
                }
                if (input.equals(reversed)) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(input + " is not a palindrome.");
                }
            }
        }