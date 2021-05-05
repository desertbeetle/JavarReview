package com.desertbeetle;

public class Reverse {

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        int j=s.length() - 1;
        char temp;
        while (i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
