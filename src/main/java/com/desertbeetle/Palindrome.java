package com.desertbeetle;


/**
 * A word, phrase, or sequence that reads the same backward as forward.
 * For example, "madam" or "nurses run" are plaindrome.
 *
 */
public class Palindrome {

    /**
     * Returns true if a string is a palindrome.
     *
     * @param s
     * @return  true if the string is a palindrome otherwise returns false
     */
    public static boolean isPalindrome(String s) {

        if (s.contains(" ")) {
            int i = s.indexOf(" ");
            s = s.substring(0, i) + s.substring(i+1);
        }

        int i=0, j=s.length()-1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
