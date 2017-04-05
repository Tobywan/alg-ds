package toby.ardendertat;

public class ConvertArray {

  public static void convertArray(int[] a) {
    final int FACTOR = 3;
    
    if (a == null || a.length%FACTOR != 0) {
      throw new IllegalArgumentException("Null or wrong number of elements");
    }

    final int LENGTH = a.length;
    
    if (LENGTH <= FACTOR) {
      // already converted
      return;
    }

    final int SUB_LENGTH = a.length / FACTOR;

    int src = 1;
    int tmp1 = a[src];
    for (int i = 1; i < LENGTH - 2; i++) { // iterate across all but 1st and last element
      int dest = src/SUB_LENGTH + (src%SUB_LENGTH) * FACTOR;
      int tmp2 = a[dest];
      a[dest] = tmp1;
      tmp1 = tmp2;
      src = dest;
    }
  }
  
}
