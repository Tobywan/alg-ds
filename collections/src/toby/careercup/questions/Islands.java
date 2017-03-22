package toby.careercup.questions;

public class Islands {

  private int rows;
  private int cols;
  private int isles;
  private int islandId = 1;
  private int[][] islandIds;
  private char[][] board;


  /**
 * A 2 dimensional (x,y) array, which was initially initialized
 * with 'o' (signals "water"),  An array of columns
 *
 */
  public Islands(char[][] board) {
    this.board = board;
    rows = board[0].length;  // the number of elements in a column
    cols = board.length;    // the number of columns
    islandIds = new int[cols][rows];
  }

  /** 
   * the function changes the value/state of that position to 'x'
   * (signals "land") and returns the number of isles in the board.
   * @return the new number of isles in the board
   */
  public int addLand(int x, int y) {
  
    if (x <0 || y < 0 || x >= cols || y >= rows ) {
      throw new IllegalArgumentException("Not in board!");
    }

      if (board[x][y] == 'x') {
      return isles;
    }
  
    int thisId = islandId++;
    board[x][y] = 'x';
    islandIds[x][y] = thisId;


    int adjacent = countAdjacent(x,y);

    // figure out if islands have joined.
    if (adjacent == 0) {
     isles++;
     return isles;
    }   
    
    isles = isles - (adjacent - 1);
    renumberAdjacent(x, y, thisId);
    return isles;
  }

  private void renumberAdjacent(int x, int y, int newId) {
    // base case
    if (islandIds[x][y] == 0 || islandIds[x][y] == newId) {
      return;
    }

    islandIds[x][y] = newId;

    if (x > 0) {
      renumberAdjacent(x - 1, y, newId);
    }

    if (x < (cols - 1)) {
      renumberAdjacent(x + 1, y, newId);
    }

    if (y > 0) {
      renumberAdjacent(x, y - 1, newId);
    }

    if (y < (rows - 1)) {
      renumberAdjacent(x, y + 1, newId);
    }
  }

 
  private int countAdjacent(int x, int y) {

    int result = 0;
    if (x > 0 && board[x - 1][y] == 'x') {
      result++;
    }

    if (x < (cols - 1) && board[x + 1][y] == 'x') {
      result++;
    }

    if (y > 0 && board[x][y - 1] == 'x') {
      result++;
    }

    if (y < (rows - 1) && board[x][y + 1] == 'x') {
      result++;
    }

    return result;

  }

}

