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
public class Binarytree {
    Treenode root;
    public boolean isEmpty(){
        return (root==null);
        }      
//method insert data 
    public void insert(Treenode input) {
     if (isEmpty()) {
         root = input;
     } else {
         // cari parent yg sesuai dan (kiri/kanan) 
         Treenode current = root;
         Treenode parent = null;
         boolean diKiri = true;
         while (current != null) {
             parent = current;
             // kalau data yang akan diinputkan lebih besar,  
             // bergerak ke kanan   
             if (current.data < input.data) {
                 current = current.right;
                 diKiri = false;
             // else gerak ke kiri 
             }
             else if(current.data > input.data){
                 current = current.left;
                 diKiri = true;
             }
             else {
                 System.out.println("data "+input.data+" sudah ada");
                 
                 break;
             }
         }
         // hubungkan ke parent  
         if (diKiri) {
             parent.left = input;
         } else {
             parent.right = input;
         }
     }
    }
    public void preOrder(){
        preOrder(root);
    }
    public void inOrder(){ 
        inOrder(root);   
    }   
    public void postOrder(){  
        postOrder(root);    
    }   
    public void preOrder(Treenode root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    } 
    public void inOrder(Treenode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public void postOrder(Treenode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
