package trees;

public class Traversal {

    public static void main(String[] args) {

        Node root = new Node();
        root.data = 0;
        Node child1 = new Node();
        child1.data = 1;
        Node child2 = new Node();
        child2.data = 2;

        root.left = child1;
        root.right = child2;

        inOrderTraversal(root);

    }

    private static void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

}

class Node{
    int data;
    Node left;
    Node right;
}
