package Recursion.palindromic_phrase;

import java.util.*;
public class PalindromicPhrase {
    public static boolean isPalindrome(String text) {
        int length = text.length();
        if (length <= 1) {
            return true;
        } else {
            char first = Character.toLowerCase(text.charAt(0));
            char last = Character.toLowerCase(text.charAt(length - 1));

            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    String shorterText = text.substring(1, length - 1);
                    return isPalindrome(shorterText);
                } else {
                    return false;
                }
            } else if (!Character.isLetter(last)) {
                String shorterText = text.substring(0, length - 1);
                return isPalindrome(shorterText);
            } else {
                String shorterText = text.substring(1);
                return isPalindrome(shorterText);
            }
        }
    }
    /**
     Tests whether a substring is a palindrome.
     @param text a string that is being checked
     @param start the index of the first character of the substring
     @param end the index of the last character of the substring
     @return true if the substring is a palindrome
     */
    public static boolean isPalindrome(String text, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            char first = Character.toLowerCase(text.charAt(start));
            char last = Character.toLowerCase(text.charAt(end));
            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    return isPalindrome(text, start + 1, end - 1);
                } else {
                    return false;
                }
            } else if (!Character.isLetter(last)) {
                return isPalindrome(text, start, end - 1);
            } else {
                return isPalindrome(text, start + 1, end);
            }
        }
    }

    public static boolean isPalindromeAnotherMethodHelper(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String text = sc.nextLine();
        if (isPalindrome(text)) {
            System.out.println("The phrase " + "\"" + text + "\"" + " is a palindromic phrase");
        } else {
            System.out.println("The phrase " + "\"" + text + "\"" + " is not a palindromic phrase");
        }
    }
}
