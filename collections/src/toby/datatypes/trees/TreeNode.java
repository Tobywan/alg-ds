package toby.datatypes.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<E> {

    private List<TreeNode<E>> children;
    private E data;
    
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
    
        if (children == null)
        {
            children = new ArrayList<>();
        }
        
        children.add(child);
        //System.out.println("Adding " + child);
        
    }
    
    public String toString() {
        return (data == null) ? "Null data" : data.toString();
    }
    
    

}
