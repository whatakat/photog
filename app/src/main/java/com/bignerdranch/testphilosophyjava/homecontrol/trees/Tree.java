package com.bignerdranch.testphilosophyjava.homecontrol.trees;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Tree {
    private Node root;
    public Node find(int key){
        Node current = root;
        while (current.personT.id !=key){
            if(key<current.personT.id){
                current = current.leftChild;
            }else {
                current=current.rightChild;
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }
    public void insert(PersonT personT){
        Node node = new Node();
        node.personT = personT;
        if (root == null){
            root =node;
        }else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if (personT.id<current.personT.id){
                    current = current.leftChild;
                    if (current==null){
                        parent.leftChild = node;
                        return;
                    }
                }else {
                    current= current.rightChild;
                    if (current==null){
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }
    public boolean delete(int id){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.personT.id !=id){
            parent = current;
            if (id<current.personT.id){
                isLeftChild = true;
                current=current.leftChild;
            }else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null){
                return false;
            }
        }
        if (current.leftChild ==null && current.rightChild == null){
            if (current == root){
                root = null;
            }else if (isLeftChild){
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }

        }
        else if (current.rightChild ==null){
            if(current == root){
                root = current.leftChild;
            }else if (isLeftChild){
                parent.leftChild = current.leftChild;
            }else {
                parent.rightChild=current.leftChild;
            }
        }
        else if (current.leftChild == null){
            if (current ==root){
                root = current.rightChild;
            }else if (isLeftChild){
                parent.leftChild = current.rightChild;
            }else {
                parent.rightChild = current.rightChild;
            }
        }else {
            Node succseccor = getSuccessor(current);
            if (current==root){
                root = succseccor;
            }else if (isLeftChild){
                parent.leftChild = succseccor;
            }else {
                parent.rightChild = succseccor;
            }
            succseccor.leftChild = current.leftChild;
        }
        return true;
    }

    public void inOrder(Node rootNode){
        if(rootNode !=null){
            inOrder(rootNode.leftChild);
            rootNode.display();
            inOrder(rootNode.rightChild);
        }
    }

    public Node min(){
        Node current, last = null;
        current = root;
        while (current !=null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node max(){
        Node current, last = null;
        current = root;
        while (current != null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public Node getSuccessor(Node node){
        Node successorParent =node;
        Node successor = node;
        Node current = node.rightChild;
        while (current != null){
            successorParent = successor;
            successor = current;
            current=current.leftChild;
        }
        if (successor !=node.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }
    public void traverse(int traverseType){
        switch (traverseType){
            case 1: print("Preorder traversal");
            preOrder(root);
            break;
        }
    }
    private void preOrder(Node rootNode){
        if (rootNode != null){
            rootNode.display();
            preOrder(rootNode.leftChild);
            preOrder(rootNode.rightChild);
        }
    }
    private void postOrder(Node rootNode){
        if (rootNode != null){
            postOrder(rootNode.leftChild);
            postOrder(rootNode.rightChild);
            rootNode.display();
        }
    }
    /*private void inOrder(Node rootNode){
        if (rootNode !=null){
           inOrder(rootNode.leftChild);
            rootNode.display();
           inOrder(rootNode.rightChild);
        }
    }*/
    public void displayTree(){
        Stack stack = new Stack ( 100 );
        stack.push ( root );
        int nBlanks = 32;
        boolean isRowEmpty = false;
        while (! isRowEmpty ) {
            Stack localStack = new Stack ( 100 );
            isRowEmpty = true;
            for ( int i = 0 ; i < nBlanks ; i ++){
                System.out.print ( " " );
            }
            while (! stack.isEmpty ()) {
                Node temp = stack . pop ();
                if ( temp != null ){
                    temp.display ();
                    localStack.push ( temp.leftChild );
                    localStack.push ( temp.rightChild );
                    if ( temp.leftChild != null || temp.rightChild != null ){
                        isRowEmpty = false;
                    }
                } else{
                    System.out.print ( "--" );
                    localStack.push ( null );
                    localStack.push ( null );
                }
                for ( int j = 0 ; j < nBlanks * 2 - 2 ; j ++)
                    System.out.print ( ' ' );
            }
            System.out.println ( " " );
            nBlanks = nBlanks / 2;
            while (! localStack.isEmpty ()) {
                stack.push ( localStack.pop ());
            }
            System.out.println ( "......................................................" );
        }
    }
}

