package toby.ardendertat;

public class UnknownLengthArray {

  

public static int findIndex(int[] a, int k) {

  if (a == null) {
    return -1;
  }

  try {
    if (a[0] == k) {
      return 0;
    }

  } catch (ArrayIndexOutOfBoundsException e) {
    return -1;
  }

  int iLeft = 0; // we know this is safe
  int iRight = getSafeRight(iLeft, a);


  // find the interval that k might live in
  boolean foundRange = false;

  while (!foundRange) {
    if (a[iLeft] == k) {
      return iLeft;
    }
    if (a[iRight] == k) {
      return iRight;
    }
  
    if (iLeft == iRight) {
      // not found, no more indeces to the right of iLeft
      return -1;
    }
    
    foundRange = (a[iLeft] < k && a[iRight] > k);
    if (!foundRange) {
      iLeft = iRight;
      iRight = getSafeRight(iLeft, a);

    }
  
  }

  if (!foundRange) {
    return -1;
  }
  return findInRange(k, a, iLeft, iRight);
}

// recursive calls
private static int findInRange(int k, int[] a, int iLeft, int iRight) {
  System.out.println("Find in range: " + iLeft + "->" + iRight );
  // base case
    if (a[iLeft] == k) {
      return iLeft;
    }
    if (a[iRight] == k) {
      return iRight;
    }
    if (iLeft == iRight) {
      return -1;
    }
    int iMid = (iLeft + iRight) / 2 ;
    if (k < a[iMid]) {
      return findInRange(k, a, iLeft, iMid);
    } else if (k > a[iMid]) {
      return findInRange(k, a, iMid, iRight);
    } else {
      //found it!
      return iMid;
    }

}

/**
*  Assuming safeLeft is in the array, find a suitable right index that is in the array too
*/
private static int getSafeRight(int safeLeft, int[] a) {
  // left and initial 
  int result = (safeLeft == 0) ? 1 : 2 * safeLeft ;

  boolean overshot = true;
  while (overshot && result > safeLeft) {
    try {
      int tmp = a[result];
      overshot = false;
    } catch (ArrayIndexOutOfBoundsException e) {
        // result is too far, wind it back.
      result = (result + safeLeft) / 2;
      overshot = true;
    }
  }
  System.out.println("getSafeRight: " + safeLeft + "->" + result );
  return result;

}

}
