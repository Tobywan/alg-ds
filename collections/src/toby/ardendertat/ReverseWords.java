package toby.ardendertat;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {

  private static final String SPACE = " ";

  /**
  * split the words across k machines
  */
  public static void reverseWords(char[] words, int k, PrintStream out) {

  ArrayList<Stack<String>> results = new ArrayList<Stack<String>>();
  if (words == null || words.length == 0 || k < 1) {
    out.println();
  }
    final int len = words.length;
    int chunkSize = len / k; // 11 / 3 = 3
    
    for (int i = 0; i < k; i++ ) { // 0 to 2
      int start = i * chunkSize;
      int end = (i == (k - 1)) ? words.length : start + chunkSize; // last chunk is rest of array
      char[] part = Arrays.copyOfRange(words, start, end);
      results.add(processPart(part));
    }

    // Now process our stacks
    // discard the first space if there is one:
    Stack<String> current = results.get(k - 1);
    if (SPACE.equals(current.peek())) {
      current.pop();
    }
    for (int i = k - 1; i > -1; i--) {
      current = results.get(i);
        while (!current.isEmpty()) {
        String tmp = current.pop();
        // Don't add the  very last space if there is one
        if (i == 0 && current.isEmpty() && SPACE.equals(tmp)) {
          // Don't add
        } else {
          out.print(tmp);
        }
      }

    }
    
  }

  public static Stack<String> processPart(char[] part) {


    int idxStart = 0;
    int idxEnd = 0;
    Stack<String> result = new Stack<>();

    while (idxStart < part.length) {
      if (Character.isWhitespace(part[idxStart])) {
        result.push(SPACE);
        while (idxStart < part.length && Character.isWhitespace(part[idxStart])) {
          // Advance to first non white space char
          idxStart++;
        }
      }
      idxEnd = idxStart;

      while (idxEnd < part.length && !Character.isWhitespace(part[idxEnd])) {
        // Advance to first white space char
        idxEnd++;
      }

      if (idxEnd > idxStart) {
        result.push(new String(part, idxStart, idxEnd - idxStart));
      }
      idxStart = idxEnd;

    }
    return result;
  }


}
