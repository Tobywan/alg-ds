package toby.ardendertat;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestContinuousSumTest {

  @Test
  public void test() {
    int[] input = {};
    assertEquals(0,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void test1() {
    int[] input = null;
    assertEquals(0,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void test2() {
    int[] input = {1,1,1,1};
    assertEquals(4,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void test3() {
    int[] input = {-4,-3,-2,-1,-2,-3,-4};
    assertEquals(-1,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void test4() {
    int[] input = {1,2,3,-6,1,2};
    assertEquals(6,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void test5() {
    int[] input = {1,-1,2,-2};
    assertEquals(2,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void tes6() {
    int[] input = {10,-5,2,8,1 };
    assertEquals(16,LargestContinuousSum.largestSum(input));
  }

  @Test
  public void test7() {
    int[] input = {-10,10,-10};
    assertEquals(10,LargestContinuousSum.largestSum(input));
  }

}
