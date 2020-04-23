package com.company;

class Node {
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }

    public void printLevelOrder(){//
         int h = height(root);
        System.out.println("h: " + h);

        for ( int i = 0; i <= h ; i++) {
            printGivenLevel(root, i);
        }
    }

    public int height(Node root){

        if(root == null){
            return 0;
        }
        else{
            int lheight = height(root.left);
            System.out.println("LHeight: " + lheight);
            int rheight = height(root.right);
            System.out.println("RHeight: " + rheight);

            if(lheight > rheight){
                return(lheight+1);
            }
            else{
                return(rheight+1);
            }
        }
    }

    public void printGivenLevel(Node root, int level){
        System.out.println("Level: " + level);
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.println(root.data + " ");
        }
        else if(level > 1){
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level -1);
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");

        tree.printLevelOrder();
    }
}
