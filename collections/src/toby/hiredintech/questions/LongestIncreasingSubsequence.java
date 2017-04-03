package toby.hiredintech.questions;

import java.util.List;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
  public static List<Integer> longest_increasing_subsequence(List<Integer> sequence) {
    int n = sequence.size();
    if (n == 1) {
      return sequence;
    }
    int[] lengths = new int[n];
    int[] previous = new int[n];
    lengths[0] = 1;
    previous[0] = 0;

    for (int i = 1; i < n; i++) {   // 3

      for (int j = 0; j < i; j++) { // 2
//        System.out.println("i = " + i + "|j = " + j + "|lengths[j] = " + lengths[j] + "|lengths[i] = " + lengths[i]); 
        if (sequence.get(i) > sequence.get(j) && lengths[j] + 1 > lengths[i]) {
          lengths[i] = lengths[j] + 1; // [1,2,3,1]
          previous[i] = j; 
        }
      }
    }

    // Iterate over L to find the longest sequence and its index
    int iMax = 0;
    int valMax = 0;
    for (int i = 0; i < n; i++) {
      if (lengths[i] > valMax) {
        valMax = lengths[i];
        iMax = i;
      }
    }
    
    System.out.println("Input = " + sequence);
    System.out.println("Lengths = " + Arrays.toString(lengths));
    System.out.println("Previous = " + Arrays.toString(previous));

    // Use index to work back through P[] to find the longest sequence.
    Integer[] result = new Integer[valMax];
    int idx = valMax - 1;
    while (idx > -1) {

      result[idx] = sequence.get(iMax);
      iMax = previous[iMax];
      idx--;
    }

    return Arrays.asList(result);
  }
}
