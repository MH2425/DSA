package Recursion.permutations;

import java.util.Scanner;
import java.util.ArrayList;
public class Permutations {
    /**
     * This class computes permutations of a String
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string to compute its permutations: ");
        String word = scanner.nextLine();
        for (String s : permutations(word)) {
            System.out.println(s);
        }
        // There are n! permutations, so it is very difficult to use for loops
    }

    /**
     * Get all permutations of the give word
     * @param word the string to permute
     * @return a list of permutations
     */
    public static ArrayList<String> permutations(String word) {
        ArrayList<String> result = new ArrayList<String>();
        // Empty string has single permutation: itself
        if (word.isEmpty()) {
            result.add(word);
        } else {
            // Looping through all character positions
            int length = word.length();
            for (int charIdx = 0; charIdx < length; charIdx++) {
                // Form a shorter word by removing the ith character
                String shorter = word.substring(0, charIdx) + word.substring(charIdx + 1);

                // Generate a permutations of the simpler word
                ArrayList<String> shorterPermutations = permutations(shorter);

                // Add the removed character to the front of each permutation of the simpler word
                for (String string : shorterPermutations) {
                    result.add(word.charAt(charIdx) + string);
                }
            }
        }
        return result;
    }

}
