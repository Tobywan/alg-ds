package toby.ardendertat;

import org.junit.Test;

public class ArrayPairSumTest {

  @Test
  public void testFindPairs1() {
    int[] data = {1,1};
    int sum = 2;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

  @Test
  public void testFindPairs2() {
    int[] data = {1,1,1,1,2,2,2,2};
    int sum = 3;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

  @Test
  public void testFindPairs3() {
    int[] data = {1,2,1,2,1,2,1,1,2,1,2,1};
    int sum = 3;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }


  @Test
  public void testFindPairs4() {
    int[] data = {1,2,1,2};
    int sum = 3;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

  @Test
  public void testFindPairs5() {
    int[] data = {1,2,1,2};
    int sum = 3;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

  @Test
  public void testFindPairs6() {
    int[] data = {1,2,1,2};
    int sum = 3;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

  @Test
  public void testFindPairs7() {
    int[] data = {1,1,1,1,2,2,3,3,3,3,3};
    int sum = 4;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

  @Test
  public void testFindPairs8() {
    int[] data = {3,4,1,-10,-5,-2,7};
    int sum = -7;
    
    ArrayPairSum.findPairs(data, sum, System.out); 
    
  }

}
