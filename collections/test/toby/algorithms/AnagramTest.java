package toby.algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AnagramTest {

    private Anagram uut;
    
    @Rule
    public ExpectedException ex = ExpectedException.none();
    
    @Before
    public void setup() {
        uut = new Anagram();
    }
    
    @Test
    public void nullShouldThrowException() {
        
        ex.expect(IllegalArgumentException.class);
        ex.expectMessage("Input cannot be null");
        uut.isAnagram(null, null);

    }

    @Test
    public void identicalStrings() {
        
        assertTrue(uut.isAnagram("cat", "cat"));

    }

    @Test
    public void emptyStrings() {
        
        assertTrue(uut.isAnagram("", ""));

    }
    
    @Test
    public void anagramsUniqueInput() {
        
        assertTrue(uut.isAnagram("abcdefg", "gadcfeb"));

    }
    
    @Test
    public void notAnagramsDuplicates() {
        
        assertFalse(uut.isAnagram("balls", "baals"));

    }
    
    @Test
    public void anagramsDuplicates() {
        
        assertTrue(uut.isAnagram("abcabcabc", "cccbbbaaa"));

    }
    
    

}
