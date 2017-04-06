package toby.ardendertat;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnknownLengthArrayTest {

  private static final int[] DATA =
      {32308, 38539, 42095, 61057, 90922, 92999, 96835, 118526, 124137, 124571, 161203, 176968,
       178334, 184240, 196502, 215507, 220381, 223605, 224376, 228532, 258249, 261592, 278155,
       285913, 300818, 307952, 310021, 310870, 315702, 322414, 323565, 342277, 368674, 379126,
       404401, 410486, 418063, 437833, 457107, 463638, 471938, 477960, 480127, 481346, 482692,
       483371, 502878, 502976, 514612, 523663, 539690, 550538, 551156, 554259, 563687, 576835,
       582365, 592966, 605823, 616530, 622211, 631618, 643499, 652031, 656556, 720856, 738921,
       753182, 769299, 781724, 788200, 791261, 793516, 799959, 803375, 808388, 810145, 811040,
       821192, 821622, 832431, 833476, 833663, 868266, 887156, 890166, 903488, 906340, 907953,
       916982, 918102, 923817, 930892, 936480, 952916, 962823, 967775, 980790, 982231, 987636};

  @Test
  public void testFindIndex() {
    int[] input = {1};
    int expected = 0;
    int actual = UnknownLengthArray.findIndex(input, 1);

    assertEquals(expected, actual);

  }

  @Test
  public void testFindIndex1() {
    int[] input = {1};
    int expected = -1;
    int actual = UnknownLengthArray.findIndex(input, 2);

    assertEquals(expected, actual);

  }

  @Test
  public void testFindIndex2() {
    int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
    int expected = 10;
    int actual = UnknownLengthArray.findIndex(input, 11);

    assertEquals(expected, actual);

  }

  @Test
  public void testFindIndex3() {
    int[] input = {-50, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
    int expected = 0;
    int actual = UnknownLengthArray.findIndex(input, -50);

    assertEquals(expected, actual);

  }

  @Test
  public void testFindIndex4() {
    int[] input = DATA;
    int expected = -1;
    int actual = UnknownLengthArray.findIndex(input, 1000000);

    assertEquals(expected, actual);

  }

  @Test
  public void testFindIndex5() {
    int[] input = DATA;
    int expected = 99;
    int actual = UnknownLengthArray.findIndex(input, 987636);

    assertEquals(expected, actual);

  }
  
  @Test
  public void testFindIndex6() {
    int[] input = DATA;
    int expected = 55;
    int actual = UnknownLengthArray.findIndex(input, 576835);

    assertEquals(expected, actual);

  }

}
