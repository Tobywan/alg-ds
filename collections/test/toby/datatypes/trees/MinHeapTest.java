package toby.datatypes.trees;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MinHeapTest {
    
    @Test
    public void addSingleNode() {
    
        MinHeap<Integer> uut = new MinHeap<Integer>(Integer.class, 1);
        assertEquals(0, uut.size());
        
        uut.add(1);
        Integer[] expected = {null, 1};
        assertArrayEquals(expected, uut.getData());

        assertEquals(1, uut.size());
        assertEquals(1, uut.peekMin().intValue());
        assertEquals(1, uut.popMin().intValue());
        assertEquals(0, uut.size());

        assertNull(uut.peekMin());
        assertNull(uut.popMin());
        
    }
    
    @Test
    public void duplicates() {
    
        MinHeap<Integer> uut = new MinHeap<Integer>(Integer.class, 15);
        assertEquals(0, uut.size());
        
        uut.add(1);
        uut.add(2);
        uut.add(1);
        uut.add(2);
        uut.add(1);
        uut.add(2);
        uut.add(1);
        uut.add(2);
        uut.add(1);
        uut.add(2);
        uut.add(1);
        uut.add(2);
        uut.add(1);
        uut.add(2);
        uut.add(1);
        Integer[] expected = {null, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
        
    }

    @Test
    public void addAscending() {
    
        MinHeap<Character> uut = new MinHeap<Character>(Character.class, 5);
        assertEquals(0, uut.size());

        Character[] expected = {null, null, null, null, null, null};
        
        uut.add('z');
        expected = new Character[] {null, 'z', null, null, null, null};
        assertArrayEquals(expected, uut.getData());
        
        uut.add('y');
        expected = new Character[] {null, 'y', 'z', null, null, null};
        assertArrayEquals(expected, uut.getData());

        uut.add('x');
        expected = new Character[] {null, 'x', 'z', 'y', null, null};
        assertArrayEquals(expected, uut.getData());
        
        uut.add('w');
        expected = new Character[] {null, 'w', 'x', 'y', 'z', null};
        assertArrayEquals(expected, uut.getData());

        uut.add('v');
        expected = new Character[] {null, 'v', 'w', 'y', 'z', 'x'};
        assertArrayEquals(expected, uut.getData());

    }

    @Test
    public void grow() {
        MinHeap<Integer> uut = new MinHeap<Integer>(Integer.class, 1);
        assertEquals(0, uut.size());
        
         for (int i = 0; i < 2000; i++) {
             uut.add(i);
         }
         
         assertEquals(2000, uut.size());
    }

    @Test
    public void minHeapProperty() {
        
        MinHeap<Double> uut = new MinHeap<Double>(Double.class, 1);
        
         for (int i = 0; i < 1000; i++) {
             double in = Math.random() * 1000;
             System.out.println(">> " + in);
             uut.add(Math.random() * 1000);
         }
         
         double f1 = uut.popMin();
         while (uut.size() > 0) {
             System.out.println("<< " + f1);
             double f2 = uut.popMin();
             assertThat(f1, lessThan(f2));
             f1 = f2;
         }
        
    }
}
