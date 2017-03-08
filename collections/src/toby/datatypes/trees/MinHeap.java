package toby.datatypes.trees;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Assume E extends Comparable
 * 
 */
public class MinHeap<E extends Comparable> {

    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public MinHeap(Class<E> clazz, int capacity) {
        data = (E[])Array.newInstance(clazz, capacity + 1);
        data[0] = null;
    }

    public E peekMin() {
        if (size == 0) {
            return null;
        }
        return data[size];
    }

    public int size() {
        return size;
        
    }
    public E popMin() {
        if (size == 0) {
            return null;
        }
        E result = data[1];
        data[1] = data[size];
        data[size] = null;
        size--;
        percDown(1);
        return result;
    }

    public void add(E item) {
        if (size == data.length - 1) {
            growData();
        }
        size++;
        data[size] = item;
        percUp(size);

    }

    private void percUp(int index) {
        boolean isCorrect = false;
        int i = index;

        while (!isCorrect && i > 1) {
            int p = i / 2; // parent index
            if (data[p].compareTo(data[i]) > 0) {
                // parent greater
                E tmp = data[p];
                data[p] = data[i];
                data[i] = tmp;
            }
            else
            {
                isCorrect = true;
            }
            i = p;

        }
    }

    private void percDown(int index) {
        boolean isCorrect = false;
        int i = index;
        int iLeft = index * 2;
        
        while (iLeft <= size && !isCorrect) {
            
            int iRight = iLeft + 1;
            int iMin;
            
            if (iRight > size) {
                iMin = iLeft;
            }
            else {
                iMin = (data[iRight].compareTo(data[iLeft]) > 0) ? iLeft : iRight;
            }
            
            if (data[i].compareTo(data[iMin]) > 0 ) {
                // parent greater
                E tmp = data[iMin];
                data[iMin] = data[i];
                data[i] = tmp;
                
            }
            else
            {
                isCorrect = true;
            }
            i = iMin;
            iLeft = i * 2;
        }
    }

    // package private
    E[] getData() {
        return data;
    }
    
    private void growData() {
        // make data twice as big
        
        data = Arrays.copyOf(data, data.length * 2);
    }

}
