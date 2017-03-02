package toby.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    /**
     * returns true if s and t are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {

        if (s == null || t == null)
            throw new IllegalArgumentException("Input cannot be null");

        if (s.equals(t))
            return true;

        Map<Character, Integer> occurences = new HashMap<Character, Integer>();

        for (char cs : s.toCharArray()) {
            Integer occur = occurences.get(cs);
            if (occur == null)
                occurences.put(cs, 1);
            else
                occurences.put(cs, ++occur);
        }

        for (char ct : t.toCharArray()) {
            Integer occur = occurences.get(ct);
            if (occur == null)
                return false;
            occurences.put(ct, --occur);
        }

        for (int i : occurences.values()) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
