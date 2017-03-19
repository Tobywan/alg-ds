package toby.exercises.chapter8;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveMultiplyTest {

  @Test
  public void testMultiplyZero() {
    
    assertEquals(0, RecursiveMultiply.multiply(0, 1));
    
    assertEquals(0, RecursiveMultiply.multiply(100, 0));

    assertEquals(0, RecursiveMultiply.multiply(0, 0));
    
  }

  @Test
  public void testMultiplyMax() {
    
    long max = Integer.MAX_VALUE;
    max *= Integer.MAX_VALUE;
    
    assertEquals(max, RecursiveMultiply.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE));
  }
  
  @Test
  public void testMultiplyPrimes() {
    
    long expected = 17 * 97;
    
    assertEquals(expected, RecursiveMultiply.multiply(17, 97));
  }
  
  @Test
  public void testMultiplyPowersOfwo() {
    
    long expected = 65536 * 256;
    
    assertEquals(expected, RecursiveMultiply.multiply(65536, 256));
  }
  
  @Test
  public void testMultiplyEvenOdd() {
    int a = 37;
    int b = 18;
    
    long expected = a * b;
    
    assertEquals(expected, RecursiveMultiply.multiply(a, b));
  }
  
  @Test
  public void testMultiplyCommutative() {
    int a = 1;
    int b = 100;
    
    long expected = a * b;
    
    assertEquals(expected, RecursiveMultiply.multiply(a, b));
    assertEquals(expected, RecursiveMultiply.multiply(b, a));
  }
  
  

}
