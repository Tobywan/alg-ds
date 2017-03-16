package toby.exercises.chapter1;

public class Urlify {


  /** javadoc tba
   * 
   */
  public static void encodeSpaces(char[] buffer, int trueLen) {
    
    if (trueLen == 0) {
      // nothing to do!
      return;
    }
    
    // count spaces
    int spaces = 0;
    for (int i = 0; i < trueLen; i++) {
      if (buffer[i] == ' ') {
        spaces++;
      }
    }
    
    if (spaces == 0) {
      // nothing to do!
      return;
    }
    
    int srcIdx = trueLen - 1;
    int dstIdx = srcIdx + (spaces * 2);
    
    while (srcIdx >= 0 && spaces > 0) {
      char c = buffer[srcIdx--];
      if (c != ' ') {
        buffer[dstIdx--] = c;
      } else { 
        buffer[dstIdx--] = '0';
        buffer[dstIdx--] = '2';
        buffer[dstIdx--] = '%';
      }
    }
    
  }
  
}
