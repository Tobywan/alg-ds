package toby.hiredintech.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumericPalendromesTest {

  @Test
  public void testIs_numeric_palindrome() {
    assertTrue(NumericPalendromes.is_numeric_palindrome(1));
    assertTrue(NumericPalendromes.is_numeric_palindrome(100000001));
    assertTrue(NumericPalendromes.is_numeric_palindrome(987656789));
    assertFalse(NumericPalendromes.is_numeric_palindrome(123));
    assertFalse(NumericPalendromes.is_numeric_palindrome(1000100001));
    assertTrue(NumericPalendromes.is_numeric_palindrome(0));
    assertTrue(NumericPalendromes.is_numeric_palindrome(11));
    assertFalse(NumericPalendromes.is_numeric_palindrome(10));
    assertFalse(NumericPalendromes.is_numeric_palindrome(10000000000L));
    assertFalse(NumericPalendromes.is_numeric_palindrome(9999999999L));
  }

}
