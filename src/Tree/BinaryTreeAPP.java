/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author User
 */
public class BinaryTreeAPP {
    public static void main(String[] args) {
        Binarytree tree=new Binarytree();
        
        Treenode node;
        
        node = new Treenode(60);
        tree.insert(node);
        
        node = new Treenode(40);
        tree.insert(node);
        
        node = new Treenode(30);
        tree.insert(node);
        
        node = new Treenode(50);
        tree.insert(node);
        
        node = new Treenode(80);
        tree.insert(node);
        
        
        
        System.out.print("nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
    }
}

