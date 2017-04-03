package toby.ardendertat;

import java.io.PrintStream;
import java.util.HashSet;

public class ArrayPairSum {

  
  public static void findPairs (int[] a, int k, PrintStream out) {

    out.println("=====================");
  //create hashset seen
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> used = new HashSet<>();

    for (int n : a) {
      
      if (!seen.contains(n)) {
        seen.add(n);
      }
      
      int d = k - n;
      boolean isSeen = seen.contains(d);
      boolean isUsed = used.contains(d);
      if (isSeen && !isUsed) {
        used.add(d);
        used.add(n);
        int min = Math.min(n,d);
        int max = Math.max(n,d);
        // Use string builder
        out.println("(" + min + "," + max + ")"  );
      }
    }
  }
}
