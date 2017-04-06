package toby.ardendertat;

import org.junit.Test;

import toby.datatypes.trees.TreeNode;

public class TreeLevelOrderPrintTest {

  @Test
  public void test() {
    System.out.println("===========================");
    TreeNode<String> root = new TreeNode<String>("1");
    TreeNode<String> child2 = new TreeNode<String>("2");
    root.appendChild(child2);
    child2.appendChild(new TreeNode<String>("4"));
    TreeNode<String> child3 = new TreeNode<String>("3");
    root.appendChild(child3);
    child3.appendChild(new TreeNode<String>("5"));
    child3.appendChild(new TreeNode<String>("6"));
    
    TreeLevelOrderPrint.printLevels(root); 
  }

  @Test
  public void test1() {
    System.out.println("===========================");
    TreeNode<String> root = new TreeNode<String>("0");

    TreeNode<String> childA = root;
    for (int i = 1; i < 20; i++ ) {
      TreeNode<String> childB = new TreeNode<String>(Integer.toString(i));
      childA.appendChild(childB);
      childA = childB;
    }
    TreeLevelOrderPrint.printLevels(root); 

  }

  
}
