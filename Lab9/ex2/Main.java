import java.io.*;
import java.util.*;

// Write a function returning the letter statistics of the parameter string: contains the number of occurrences for each letter
//  in the string. Use Java's HashMap data structure where the keys are the string's characters, values are the key's 
// occurrences. For example for the input string "Helloworld" one possible ouput is "r(1)d(1)e(1)w(1)H(1)l(3)o(2)" 
// (the order doesn't matter now).

class OccuranceOfCharacter {
    public void countOccurance(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Convert String to Char Array
        char[] charArray = inputString.toCharArray();

        for (char ch : charArray) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // System.out.println(charCountMap);

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

class Main {
    public static void main(String[] args) {
        OccuranceOfCharacter occourOfCharacter = new OccuranceOfCharacter();
        occourOfCharacter.countOccurance("Helloworld");
    }
}
