package toby.exercises.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlifyTest {

  @Test
  public void testEmpty() {
    char[] output = new char[] {' ', ' ', ' ', ' '};
    char[] input = new char[] {' ', ' ', ' ', ' '};
    
    Urlify.encodeSpaces(input, 0);
    
    assertArrayEquals(output, input);
  }

  @Test
  public void testNoSpace() {
    char[] output = new char[] {'T', 'o', 'b', 'y'};
    char[] input = new char[] {'T', 'o', 'b', 'y'};
    
    Urlify.encodeSpaces(input, 4);
    
    assertArrayEquals(output, input);
  }

  @Test
  public void testOneSpace() {
    char[] output = new char[] {'%', '2', '0'};
    char[] input = new char[] {' ', ' ', ' '};
    
    Urlify.encodeSpaces(input, 1);
    
    assertArrayEquals(output, input);
  }

  @Test
  public void testOneSpaceInside() {
    char[] output = new char[] {'c', 'a', 't', 's', '%', '2', '0', 'd', 'o', 'g', 's'};
    char[] input = new char[] {'c', 'a', 't', 's', ' ', 'd', 'o', 'g', 's', ' ', ' '};
    
    Urlify.encodeSpaces(input, 9);
    
    assertArrayEquals(output, input);
  }

  @Test
  public void testSpacePadding() {
    char[] output = new char[] {'%', '2', '0', 'c', 'a', 't', 's', '%', '2', '0'};
    char[] input = new char[] {' ', 'c', 'a', 't', 's', ' ', ' ', ' ', ' ', ' '};
    
    Urlify.encodeSpaces(input, 6);
    
    assertArrayEquals(output, input);
  }

  @Test
  public void testTwoSpaces() {
    char[] output = new char[] {'%', '2', '0','%', '2', '0'};
    char[] input = new char[] {' ', ' ', ' ', ' ', ' ', ' '};
    
    Urlify.encodeSpaces(input, 2);
    
    assertArrayEquals(output, input);
  }

}
