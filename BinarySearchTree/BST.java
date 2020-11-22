import java.util.HashSet;
import java.util.LinkedList;

public class BST {
    Node root;
    BST (int rootData){
        root = new Node(rootData);
    }

public void insert (int data){
    Node newNode = new Node (data);
    Node position = root;
    while (true){
        if(data < position.data){
            if(position.leftChild == null){
                position.leftChild = newNode;
                break;
            } else {
                position = position.leftChild;
            }
        } else {
            if(position.rightChild == null){
                position.rightChild = newNode;
                break;
            } else {
                position = position.rightChild;
            }
            
        }
    }
}

public void displayTree(){
    LinkedList <Node> queue = new LinkedList<>();
    HashSet <Node> visitedSet = new HashSet<>();
    visitedSet.add(root);
    queue.addFirst(root);
    displayNode(root);
    
    while (!queue.isEmpty()){
       Node v = queue.removeLast();
       System.out.println();
       while(v.leftChild != null && !visitedSet.contains(v.leftChild)){
           queue.addFirst(v.leftChild);
           visitedSet.add(v.leftChild);
           displayNode(v.leftChild);
           break;
       }
       while(v.rightChild != null && !visitedSet.contains(v.rightChild)){
           queue.addFirst(v.rightChild);
           visitedSet.add(v.rightChild);
           displayNode(v.rightChild);
           break;
       }
    }
}

public void preOrder (Node root){
    if (root == null){
        return;
    }
    System.out.println(root.data);
    preOrder(root.leftChild);
    preOrder(root.rightChild);
}

public void inOrder (Node root){
    if(root == null){
        return;
    }
    inOrder(root.leftChild);
    System.out.println(root.data);
    inOrder(root.rightChild);
}

public void postOrder (Node root){
    if(root==null){
        return;
    }

    postOrder(root.leftChild);
    postOrder(root.rightChild);
    System.out.println(root.data);
}


public void displayNode(Node n) {
    System.out.print(n.data);
}

}