package toby.exercises.chapter8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import java.awt.Point;

public class RobotGrid {

  /**
   * 2d array of booleans where true==available and false==off limits Make it easy to check OOB by
   * using r+1 c+1 elements where cells[r][?]==false, cells[?][c]==false to mark boundary of grid
   * Grid is an array of columns means (x,y) corresponds to grid[x][y]. There are c + 1 columns and
   * each column contains r + 1 elements
   */
  private boolean[][] grid;
  private Point destination;

  public RobotGrid(int columns, int rows) {
    grid = new boolean[columns + 1][rows + 1];
    for (int c = 0; c < columns; c++) {
      Arrays.fill(grid[c], true);
      grid[c][rows] = false; // mark lower boundary
    }
    Arrays.fill(grid[columns], false);
    destination = new Point(columns - 1, rows - 1);
  }

  /**
   * //TODO javadoc
   */
  public void setOffLimits(Iterator<Point> offLimits) {
    while (offLimits.hasNext()) {
      Point p = offLimits.next();
      if (p.x == 0 && p.y == 0) {
        throw new IllegalArgumentException("Cannot offlimit cell (0,0)");
      }
      grid[p.x][p.y] = false;
    }
  }

  /**
   * //TODO javadoc
   * 
   * @return path from top left to bottom right or empty list if no path exists
   */
  public LinkedList<Point> findPath() {
    LinkedList<Point> path = new LinkedList<Point>();
    findPath(new Point(0, 0), path);
    return path;
  }

  public void findPath(Point p, LinkedList<Point> path) {

//    System.out.println("Trying " + p.toString());
    // short circuit
    if (destination.equals(path.peekLast())) {
      return; // Already found a way through, no need to check any more
    }
    // start:
    // store current node in path
    path.addLast(p);

    // if current node is last cell
    // goto success:
    if (p.equals(destination)) {
      return;
    }

    // if right is available
    // move right
    // goto start:
    boolean rightOk = grid[p.x + 1][p.y];
    if (rightOk) {
      findPath(new Point(p.x + 1, p.y), path);
    }

    boolean downOk = grid[p.x][p.y + 1];
    if (downOk) {
      // else if down is available
      // move down
      // goto start:
      findPath(new Point(p.x, p.y + 1), path);
    }
    
    // The available cells might now have been changed by memo-isation.
    // We need to check again
    rightOk = grid[p.x + 1][p.y];
    downOk = grid[p.x][p.y + 1];

    if (!rightOk && !downOk) {
      // dead end
      // mark current node as unavailable
      // remove current node from path
      // if backtrack possible
      // move to previous node
      // goto start:
      // else
      // fail
      grid[p.x][p.y] = false;
//      System.out.println("Removing " +  path.peekLast());
      path.removeLast();
      return;
    }

  }

  public String print(LinkedList<Point> path) {
    StringBuilder sb = new StringBuilder();
    for (int y = 0; y < grid[0].length - 1; y++) {
      for (int x = 0; x < grid.length - 1; x++) {
        
        if (path.contains(new Point(x,y)))
        {
          sb.append('+');  
        } else {
          sb.append(grid[x][y] ? "." : "X");
        }
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  
}
