package toby.ardendertat;

import java.util.LinkedList;

import toby.datatypes.trees.TreeNode;

public class TreeLevelOrderPrint {

  public static void printLevels(TreeNode<String> root) {

    LinkedList<NodeLevel> queue = new LinkedList<NodeLevel>();
    int currLevel = 1;
    queue.addFirst(new NodeLevel(root, currLevel));
    StringBuilder sb = new StringBuilder();
    while (!queue.isEmpty()) {
      NodeLevel nl = queue.removeLast();
      String delim = null;
      int level = nl.level;
      if (level == 1) {
        delim = "";
      } else if (currLevel == level){
        delim = " ";
      } else {
        delim = "\n";
        currLevel = level;
      }
      sb.append(delim);
      sb.append(nl.node.getData());
      
      for (TreeNode<String> child : nl.node.getChildren()) {
        queue.addFirst(new NodeLevel(child, currLevel + 1));
      }
      
    }
    System.out.println(sb.toString());

  }


  private static class NodeLevel {
    public TreeNode<String> node;
    public int level;
   
    public NodeLevel(TreeNode<String> node, int level) {
      this.node = node;
      this.level = level;
    }
  }
  
}
