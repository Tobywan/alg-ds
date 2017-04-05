package toby.algorithms.permute;

import java.util.ArrayList;
import java.util.HashMap;

public class Pemutations {

  
  public static void permuteWithDupes(String word) {
    // Assumes chars from BMP
    // build a frequency table of the characters
    
    if (word == null || word.length() < 2) {
      System.out.println(word);
    }

    HashMap<Character, Integer> characters = new HashMap<>();
    
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      
      int count = 1;
      if (characters.containsKey(c)) {
        count = characters.get(c) + 1;
      }
      characters.put(c, count);
    }
    
    ArrayList<Character> init = new ArrayList<>();
    permute(characters, init);
  }
  
  private static void permute(HashMap<Character, Integer> characters, ArrayList<Character> permutation) {
    
    // recursive base case
    if (characters.size() == 0) {
      System.out.println(permutation.toString());
      return;
    }
    
    // for each element in keys
    // clone a new  permutation and map of characters
    // decrement the count for this key
    // if he count is now zero, delete the key (after iteration)
    for (Character c : characters.keySet()) {
      HashMap<Character, Integer> newCharacters = new HashMap<Character, Integer>(characters);
      ArrayList<Character> newPermutation = new ArrayList<Character>(permutation); 
      newPermutation.add(c);
      int count = newCharacters.get(c);
      if (count <= 1) {
        // Used up the last instance
        newCharacters.remove(c);
      } else {
        // decrement the count
        newCharacters.put(c, count - 1);
      }
      
      // recurse;
      permute(newCharacters, newPermutation);
      
    }
    
  }
  
}
