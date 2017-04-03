package toby.hiredintech.questions;

public class NumericPalendromes {

  /**
   * Convert to an array of digits first Its length will be (int)Log10(n). Work from each end
   * comparing digits and fail if the don't match
   */
  public static boolean is_numeric_palindrome(long number) {
    if (number < 10) {
      return true;
    }
    int numDigits = getNumDigits(number);
    int[] digits = new int[numDigits];
    // We'll reverse the order of the digits, but that's OK for palindromes
    for (int i = 0; i < numDigits; i++) {
      digits[i] = (int) number % 10;
      number = number / 10;
    }

    int left = 0;
    int right = numDigits - 1;
    while (left < right) {
      if (digits[left] != digits[right]) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  // Currently uses O(1) log, but can use / 10 or if / else for numbers up to 10,000,000,000
  private static int getNumDigits(long number) {

    return 1 + (int) Math.log10(number);
  }
}
