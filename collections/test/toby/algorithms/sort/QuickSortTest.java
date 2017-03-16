package toby.algorithms.sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testString() {
        
        QuickSort uut = new QuickSort();
        
        String[] data = {"cats", "mice", "fish", "butterflies"};
        String[] expected = {"butterflies", "cats", "fish", "mice"};
        
        uut.sort(data);

        Assert.assertArrayEquals(expected, data);
    }

    @Test
    public void testDuplicates() {
        
        QuickSort uut = new QuickSort();
        
        String[] data     = {"cats", "mice", "fish", "butterflies", "cats", "mice", "fish", "butterflies", "cats", "mice", "fish", "butterflies"};
        String[] expected = {"butterflies", "butterflies", "butterflies", "cats", "cats", "cats", "fish", "fish", "fish", "mice", "mice", "mice"};
        
        uut.sort(data);

        Assert.assertArrayEquals(expected, data);
    }

    @Test
    public void largeData() {
        
       int numValues = 100000000;
       List<String> data = new ArrayList<>();
       
       for (int i = 0; i < numValues; i++)
       {
           data.add(Double.toString(Math.random()));
       }
       
       String[] testData = new String[numValues];
       String[] expected = new String[numValues];
       
       data.toArray(testData);
//       data.toArray(expected);
//       Arrays.sort(expected);

       QuickSort uut = new QuickSort();
       uut.sort(testData);
       
//       Assert.assertArrayEquals(expected, testData);
       
    }
}
