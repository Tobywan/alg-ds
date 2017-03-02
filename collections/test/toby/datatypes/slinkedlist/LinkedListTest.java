package toby.datatypes.slinkedlist;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void addStrings() {
        
        List<String> data = Arrays.asList("sheep", "frogs", "cats", "horses", "donkeys");
        
        LinkedList<String> uut = new LinkedList<>();
        
        int count = 0;
        assertEquals("[]", uut.toString());
        
        // Add the items
        for (String item : data) { 
            assertEquals(count++, uut.size());
            
            uut.appendTail(item);
        
        }
        assertEquals(count, uut.size());
        
        
        //Check the contents
        
        assertEquals("['sheep', 'frogs', 'cats', 'horses', 'donkeys']", uut.toString());
        
        int idx = 0; 
        Node<String> n = uut.getHead();
        
        assertEquals(data.get(idx), n.getData());
        
        while (n != null) {
            assertEquals(data.get(idx), n.getData());
            n = n.getNext();
            idx++;
        }
            
        
        
    }

}
