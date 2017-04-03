package toby.hiredintech.questions;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class LongestIncreasingSubsequenceTest {

  @Test
  public void testOne() {
    List<Integer> input = Arrays.asList(1);
    List<Integer> expected = Arrays.asList(1);
    
    List<Integer> results = LongestIncreasingSubsequence.longest_increasing_subsequence(input);

    assertEquals(expected, results);
  }

  @Test
  public void testTwoUp() {
    List<Integer> input = Arrays.asList(1,2);
    List<Integer> expected = Arrays.asList(1,2);
    
    List<Integer> results = LongestIncreasingSubsequence.longest_increasing_subsequence(input);

    assertEquals(expected, results);
  }

  @Test
  public void testTwoDown() {
    List<Integer> input = Arrays.asList(2,1);
    List<Integer> expected = Arrays.asList(2);
    
    List<Integer> results = LongestIncreasingSubsequence.longest_increasing_subsequence(input);

    assertEquals(expected, results);
  }

  @Test
  public void testNonTrivial() {
    List<Integer> input = Arrays.asList(-2,4,-10,7,12,4);
    List<Integer> expected = Arrays.asList(-2,4,7,12);
    
    List<Integer> results = LongestIncreasingSubsequence.longest_increasing_subsequence(input);

    assertEquals(expected, results);
  }

  
  
}
