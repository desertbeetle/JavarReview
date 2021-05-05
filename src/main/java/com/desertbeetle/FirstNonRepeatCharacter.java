package com.desertbeetle;

public class FirstNonRepeatCharacter {

    /**
     * Return the first non-repeat character in the string
     *
     * @param s the string to search
     * @return  first non-repeat character or null if not found
     */
    public static Character firstNonRepeatChar(String s) {
        Character c_found = null;
        for (char c : s.toCharArray()) {
            if (c_found == null) {
                c_found = c;
            }
            else if (c_found == c) {
                c_found = null;
            }
        }
        return c_found;
    }
}
