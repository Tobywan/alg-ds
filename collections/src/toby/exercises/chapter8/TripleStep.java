package toby.exercises.chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class TripleStep {

  /** JAVADOC TBD
  */
  public static int countWays(int steps) {
    
    if (steps < 2) {
      return 1;
    }

    HashSet<ArrayList<Integer>> result = findWays(steps);
    return result.size();
    
  }

/**
* To progress from n-1 ways to n ways we need:
* Iterate over the stepSeq in ways(n-1) and for each one:
* -We add 1 to each step of each sequence in a copy (as long as the result is in {1,2,3}) to yield a * * new stepSequence and insert it into ways(n)
* -We insert 1 at each available position in a copy of the stepSeq and insert it into ways(n)
*/
  private static HashSet<ArrayList<Integer>> findWays(int numSteps) {
  
    HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
    
    if (numSteps == 1) {
      ArrayList<Integer> base = new ArrayList<Integer>();
      base.add(1);
      result.add(base);
      return result;
    }
    
    HashSet<ArrayList<Integer>> previous = findWays(numSteps - 1);

// Iterate over the stepSeq in ways(n-1) and for each one:
    for (ArrayList<Integer> oldStepSeq : previous ) {
    // We insert 1 at each available position in a copy of the stepSeq and insert it into ways(n)
      for (int i = 0; i < oldStepSeq.size(); i++)
      {
        ArrayList<Integer> newStepSeq = (ArrayList<Integer>) oldStepSeq.clone();
        newStepSeq.add(i, 1);
        result.add(newStepSeq); // Check before add?
      }
      // And a sequence with 1 at the end  
      ArrayList<Integer> newStepSeq = (ArrayList<Integer>) oldStepSeq.clone();
      newStepSeq.add(1);
      result.add(newStepSeq); // Check before add?

      // We add 1 to each step of each sequence in a copy (as long as the result is in {1,2,3}) to
      // yield a new stepSequence and insert it into ways(n)

      Integer[] castHelper = new Integer[0];
      Integer[] newStepArr = oldStepSeq.toArray(castHelper);
      for (int i = 0; i < newStepArr.length; i++) {
        int n = newStepArr[i];
        if (n < 3) {
          newStepArr[i] = n + 1;
          result.add(new ArrayList<Integer>(Arrays.asList(newStepArr)));
          // Set it back to original value
          newStepArr[i] = n;
        }
      }

    }
    System.out.println("Numsteps = " + numSteps + " - " + result.toString());
    return result;
  }
  
  private class SequenceComparator implements Comparator<ArrayList<Integer>>
  {

    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
      if (o1 == null || o2 == null) {
        return -1;
      }
      int diff;
      diff = o1.size() - o2.size(); 
      if (diff != 0) {
        return diff;
      }
      
      for (int i = 1; i < o1.size(); i++) {
        diff =  o1.get(i) - o2.get(i);
        if (diff != 0) {
          return diff;
        }
      }
      
      return 0;
    }
    
  }
  
}
