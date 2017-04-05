package toby.algorithms.permute;

import org.junit.Test;

public class PemutationsTest {

  @Test
  public void testPermuteWithDupes0() {
    System.out.println("=================");
    Pemutations.permuteWithDupes("a");
  }

  @Test
  public void testPermuteWithDupes1() {
    System.out.println("=================");
    Pemutations.permuteWithDupes("aa");
  }

  @Test
  public void testPermuteWithDupes2() {
    System.out.println("=================");
    Pemutations.permuteWithDupes("aab");
  }

  @Test
  public void testPermuteWithDupes3() {
    System.out.println("=================");
    Pemutations.permuteWithDupes("aabbb");
  }

  @Test
  public void testPermuteWithDupes4() {
    System.out.println("=================");
    Pemutations.permuteWithDupes("123321");
  }

  @Test
  public void testPermuteWithDupes5() {
    System.out.println("=================");
    Pemutations.permuteWithDupes("abcdefghijk");
  }

}
