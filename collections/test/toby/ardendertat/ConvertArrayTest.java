package toby.ardendertat;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertArrayTest {

  @Test
  public void test() {
    int[] input =    {1,2,3,4,5 ,11,22,33,44,55 ,111,222,333,444,555};
    int[] expected = {1,11,111,2,22,222,3,33,333,4,44,444,5,55,555};
    
    ConvertArray.convertArray(input);
    
    assertArrayEquals(expected, input);
  }

}
