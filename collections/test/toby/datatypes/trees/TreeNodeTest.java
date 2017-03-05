package toby.datatypes.trees;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TreeNodeTest {

    
    @Test
    public void preOrderVisit() throws Exception {
        TreeNode<File> uut = treeDisk("/home/toby/Documents");
        preOrder(uut);
        
    }
    
    private void preOrder(TreeNode<File> node) {
        
        System.out.println(node.getData());
        if (node.getChildren() != null) {
            for (TreeNode<File> child : node.getChildren()) {
                preOrder(child);
            }
        }
        
    }
    
    @Test
    public void postOrderVisit() throws Exception {
        TreeNode<File> uut = treeDisk("/home/toby/Documents");
        postOrder(uut);
        
    }
    
    private void postOrder(TreeNode<File> node) {
        
        if (node.getChildren() != null) {
            for (TreeNode<File> child : node.getChildren()) {
                postOrder(child);
            }
        }
        System.out.println(node.getData());
        
    }
    
    private TreeNode<File> treeDisk(String rootDir) {
        
        File rootFile = new File(rootDir);
        
        TreeNode<File> rootNode = new TreeNode<>();
        
        
        addFile(rootNode, rootFile);
        return rootNode;
        
    }
    
    private void addFile(TreeNode<File> node, File file) {
        node.setData(file);
        
        File[] files = file.listFiles();
        
        if (files == null) {
            return;
        }
        
        for (File child : files)
        {
            TreeNode<File> newNode = new TreeNode<>();
            node.appendChild(newNode);
            addFile( newNode, child);
        }
    }

}
