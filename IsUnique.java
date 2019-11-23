package com.company;

import java.util.Arrays;

// Assumed string can be consisted of max 256 different characters.
// ASCII char -> 8 bits,  2^8 = 256 different characters.
// Time complexity O(n)

public class IsUnique{

    private final static int MAX_CHAR = 256;

    private boolean isStringUnique(String s){

        int len = s.length();

        // if len > MAX_CHAR, then at least one character was used more than once.
        if(len > MAX_CHAR){
            return false;
        }
        // a boolean array for each char
        boolean[] charArray = new boolean[MAX_CHAR];
        Arrays.fill(charArray, false);

        int char_index;
        for (int i = 0; i < len; i++) {
            char_index = s.charAt(i);
            // if char at that index is reached before, then duplicate chars
            if(charArray[char_index])
                return false;
            charArray[char_index] = true;
        }
        return true;
    }

    public static void main(String[] args) {

        IsUnique isUnique = new IsUnique();
        boolean result = isUnique.isStringUnique("kaygoren");
        if(result){
            System.out.println("All characters are unique.");
        }else {
            System.out.println("Some characters are used more than once.");
        }

    }
}