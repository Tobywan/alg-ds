package toby.ardendertat;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

import org.junit.Test;

public class ReverseWordsTest {

  
  @Test
  public void testReverseWords1() {
    System.out.println("==============");
    System.out.print(">");
    
    
    String input = " ";
    ReverseWords.reverseWords(input.toCharArray(), 1, System.out);
    System.out.print("<\n");
  }

  @Test
  public void testReverseWords2() {
    System.out.println("==============");
    System.out.print(">");
    
    
    String input = " a b c d e f g ";
    ReverseWords.reverseWords(input.toCharArray(), 1, System.out);
    System.out.print("<\n");
  }

  @Test
  public void testReverseWords3() {
    System.out.println("==============");
    System.out.print(">");
    
    
    String input = " a b c d e f g ";
    ReverseWords.reverseWords(input.toCharArray(), 4, System.out);
    System.out.print("<\n");
  }
  
  @Test
  public void testReverseManyWords() throws IOException {
    System.out.println("==============");
    System.out.print(">");
    
    
//    String input = readFile("/media/win/Users/toby/dev/java/algorithms/collections/src/toby/ardendertat/ReverseWords.java", Charset.defaultCharset());
    String input = readFile("/home/toby/junk/whatsapp.txt", Charset.defaultCharset());
    ReverseWords.reverseWords(input.toCharArray(), 4, System.out);
    System.out.print("<\n");
  }


  @Test
  public void testProcessPart1() {
    Stack<String> expected = new Stack<String>();
    expected.push(" ");
    
    String input = " ";
    Stack<String> result = ReverseWords.processPart(input.toCharArray());
    
    assertEquals(expected, result);
    
  }

  @Test
  public void testProcessPart2() {
    Stack<String> expected = new Stack<String>();
    expected.push(" ");
    expected.push("a");
    expected.push(" ");
    
    String input = " a ";
    Stack<String> result = ReverseWords.processPart(input.toCharArray());
    
    assertEquals(expected, result);
    
  }

  @Test
  public void testProcessPart3() {
    Stack<String> expected = new Stack<String>();
    expected.push("11111");
    expected.push(" ");
    expected.push("2");
    expected.push(" ");
    expected.push("33333");
    
    String input = "11111\t2\n\n33333";
    Stack<String> result = ReverseWords.processPart(input.toCharArray());
    
    assertEquals(expected, result);
    
  }

  @Test
  public void testProcessPart4() {
    Stack<String> expected = new Stack<String>();
    expected.push("11111");
    expected.push(" ");
    expected.push("33333");
    
    String input = "11111\t \t \t \t \t33333";
    Stack<String> result = ReverseWords.processPart(input.toCharArray());
    
    assertEquals(expected, result);
    
  }
  
  private static String readFile(String path, Charset encoding) 
      throws IOException 
    {
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, encoding);
    }

}
