package toby.exercises.chapter8;

public class RecursiveMultiply {

  /**
  * // TODO Javadoc
  */
  public static long multiply (int x, int y) {
    if (x == 0 || y == 0 ) {
      return 0;
    }
    
    int min = Math.min(x, y);
    int max = Math.max(x, y);
    
    return addMultiple(0, max, min);
  }


  private static long addMultiple(long subTotal, long x, int y) {

    if (y == 0) {
    return subTotal;
    }
    long evenY = y;
    evenY = (evenY >> 1) << 1;

    if (y - evenY == 1) {
      subTotal += x;
    }
    
    x <<= 1;
    y >>= 1;
    return addMultiple(subTotal, x, y);
  }

}