import java.util.Scanner;

public class Palindrome
{
    static Scanner scan = new Scanner(System.in);
    static String str = "";
    static boolean isPalindrome=false;
    public static void main (String args[]) {
        checkPalindrome();
        if(isPalindrome) {
            System.out.println(str + " is a palindrome.");
        }
        else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    public static void checkPalindrome() {
        System.out.println("Please enter the phrase you wish to check.");
        str = scan.nextLine();
        //rewriting the string to ignore spaces, capitals, and punctuation
        String phrase=str.toLowerCase();
        phrase=phrase.replace(" ","");
        phrase=phrase.replace("!","");
        phrase=phrase.replace(",","");
        phrase=phrase.replace(".","");
        int count=0;
        for(int a=0; a<phrase.length(); a++) {
            if(phrase.charAt(a)==phrase.charAt(phrase.length()-1-a)) {
                count++;
            }
        }
        if (count==phrase.length()) {
            isPalindrome=true;
        }
    }
}
