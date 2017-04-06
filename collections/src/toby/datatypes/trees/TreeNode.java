package toby.datatypes.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<E> {

    private List<TreeNode<E>> children = new ArrayList<>();;
    private E data;

    public TreeNode() {
    }
    public TreeNode(E data) {
      this.data = data;
    }
    /**
     * returns null if no children
     */
    public List<TreeNode<E>> getChildren() {
        return children;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
        //System.out.println("Setting" + data.toString());
    }

    public void appendChild(TreeNode<E> child) {
    
        children.add(child);
        //System.out.println("Adding " + child);
        
    }
    
    public String toString() {
        return (data == null) ? "Null data" : data.toString();
    }
    
    

}
