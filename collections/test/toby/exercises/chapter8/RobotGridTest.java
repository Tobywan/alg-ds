package toby.exercises.chapter8;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class RobotGridTest {

  
  @Test
  public void testSimplePath() {
    RobotGrid uut = new RobotGrid(2,2);
    ArrayList<Point> offLimits = new ArrayList<>();
    offLimits.add(new Point(1,0));
    uut.setOffLimits(offLimits.iterator());
       
    System.out.println(uut.toString());
    LinkedList<Point> result =  uut.findPath();
    System.out.println("\n");
    System.out.println(uut.toString());
    System.out.println(result);
   
  }

  @Test
  public void testdiagonalWall() {
    RobotGrid uut = new RobotGrid(4,4);
    ArrayList<Point> offLimits = new ArrayList<>();
    offLimits.add(new Point(3,0));
    offLimits.add(new Point(2,1));
    offLimits.add(new Point(1,2));
    uut.setOffLimits(offLimits.iterator());
       
    System.out.println(uut.toString());
    LinkedList<Point> result =  uut.findPath();
    System.out.println("\n");
    System.out.println(uut.toString());
    System.out.println(result);
   
  }

  @Test
  public void testBlockedPath() {
    RobotGrid uut = new RobotGrid(2,2);
    
    ArrayList<Point> offLimits = new ArrayList<>();
    offLimits.add(new Point(0,1));
    offLimits.add(new Point(1,0));
    uut.setOffLimits(offLimits.iterator());
    System.out.println(uut.toString());
    LinkedList<Point> result =  uut.findPath();
    System.out.println("\n");
    System.out.println(uut.toString());
    System.out.println(result);
   
  }

  @Test
  public void testAvoidWall() {
    RobotGrid uut = new RobotGrid(10,10);
    
    ArrayList<Point> offLimits = new ArrayList<>();
    offLimits.add(new Point(9,0));
    offLimits.add(new Point(8,1));
    offLimits.add(new Point(7,2));
    offLimits.add(new Point(6,3));
    offLimits.add(new Point(5,4));
    offLimits.add(new Point(4,5));
    offLimits.add(new Point(3,6));
    offLimits.add(new Point(2,7));
    offLimits.add(new Point(1,8));
    uut.setOffLimits(offLimits.iterator());
    
    System.out.println(uut.toString());
    LinkedList<Point> result =  uut.findPath();
    System.out.println("\n");
    System.out.println(uut.toString());
    System.out.println(result);
   
  }

  @Test
  public void testRowPath() {
    RobotGrid uut = new RobotGrid(1,10);
    
    System.out.println(uut.toString());
    LinkedList<Point> result =  uut.findPath();
    System.out.println("\n");
    System.out.println(uut.toString());
    System.out.println(result);
   
  }

  @Test
  public void testColPath() {
    RobotGrid uut = new RobotGrid(10,1);
    
    System.out.println(uut.toString());
    LinkedList<Point> result =  uut.findPath();
    System.out.println("\n");
    System.out.println(uut.toString());
    System.out.println(result);
   
  }

}
