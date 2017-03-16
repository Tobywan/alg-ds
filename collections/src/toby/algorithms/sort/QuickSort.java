package toby.algorithms.sort;


public class QuickSort {

    
    private String theArray[];
    
    public void sort(String[] toSort) {
        theArray = toSort;
        
        if (theArray == null || theArray.length < 2) {
            return;
        }
        
        int idxLeft = 0;
        int idxRight = theArray.length - 1;
        
        sort(idxLeft, idxRight);
        
        
        
    }
    
    
    private void sort(int idxLeft, int idxRight) {
//        System.out.println("Sorting between elements "+ idxLeft + "," + idxRight);
        
        if (idxLeft == idxRight) {
            // sorted!
            return;
        }
        
        int idxPivot = choosePivot(idxLeft, idxRight);
        
        swap(idxLeft, idxPivot);
        
        String pivot = theArray[idxPivot];
        
//        System.out.println("Pivot = " + pivot);
        
        int iL = idxLeft + 1; // Step over pivot
        int iR = idxRight;
        
        while (iR != iL) {
            // seek left
            while ( (theArray[iR].compareTo(pivot) > 0) && iR != iL ) {
                --iR;
            }
            // found a value to be moved or the pointers have met
            
            // seek right
            while ( (theArray[iL].compareTo(pivot) <= 0) && iR != iL ) {
                ++iL;
            }
            // found a value to be moved or the pointers have met
            
            if (iR != iL) {
                swap(iR, iL);
            }
        }
        
        // Now pointers have met..
        if (pivot.compareTo(theArray[iL]) > 0) {
            swap(idxPivot, iL);
        }
        // Otherwise the pivot is the lowest element.
        
        // determine the new subArrays
        sort(idxLeft, iL -1); // left hand subArray
        
        sort(iL, idxRight);
        
    }
    
    
    private int choosePivot(int idxLeft, int idxRight) {
        // return left index for now
        return idxLeft;
    }
    
    private void swap(int idx1, int idx2) {
        if (idx1 == idx2) {
            return;
        }
//        System.out.println("Swapping elements " + idx1 + "," + idx2);
//        System.out.println("Before = " + Arrays.toString(theArray));
        
        
        String tmp = theArray[idx1];
        theArray[idx1] = theArray[idx2];
        theArray[idx2] = tmp;
//        System.out.println("After  = " + Arrays.toString(theArray));
    }
    
    
}
