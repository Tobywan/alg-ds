package toby.careercup.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class IslandsTest {

  @Test
  public void test1x1() {

    char[][] board = {{'o'}};

    Islands uut = new Islands(board);

    assertEquals(1, uut.addLand(0,0));
   
  }

  @Test
  public void testDiagonal() {

    char[][] board = {{'o','o'},{'o','o'}};

    Islands uut = new Islands(board);

    assertEquals(1, uut.addLand(0,0));
    assertEquals(2, uut.addLand(1,1));
   
  }

  @Test
  public void testWide() {

    char[][] board = {{'o'},{'o'},{'o'}};

    Islands uut = new Islands(board);

    assertEquals(1, uut.addLand(0,0));
    assertEquals(2, uut.addLand(2,0));
    assertEquals(1, uut.addLand(1,0));
  }

  @Test
  public void testTall() {

    char[][] board = {{'o','o','o'}};

    Islands uut = new Islands(board);

    assertEquals(1, uut.addLand(0,0));
    assertEquals(1, uut.addLand(0,1));
    assertEquals(1, uut.addLand(0,2));
  }

  @Test
  public void testCheckers() {

    char[][] board = {{'o','o','o'},{'o','o','o'},{'o','o','o'}};

    Islands uut = new Islands(board);

    assertEquals(1, uut.addLand(0,1));
    assertEquals(2, uut.addLand(1,0));
    assertEquals(3, uut.addLand(1,2));
    assertEquals(4, uut.addLand(2,1));
    assertEquals(1, uut.addLand(1,1));
  }

}
