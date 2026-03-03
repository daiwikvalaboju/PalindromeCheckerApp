public class PalindromeCheckerApp {
    static void main() {
        System.out.println("welcome to palindrome checker");
        System.out.println("version 1.0");
        System.out.println("system initialised");

        String input ="tenet";
        boolean ispalindrome = true;
        for (int i=0;i< input.length()/2;i++){
            if (input.charAt(i)!= input.charAt(input.length()-1-i)){
                ispalindrome = false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println(input + " is a palindrome.");
        }else {
            System.out.println(input + " not a palindrome.");
        }
    }
}
