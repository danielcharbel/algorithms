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

        System.out.println("Pre Order Traversal:");
        preOrderTraversal(root);

        System.out.println("\nIn Order Traversal:");
        inOrderTraversal(root);

        System.out.println("\nPost Order Traversal: ");
        postOrderTraversal(root);
    }

    private static void preOrderTraversal(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    }

    private static void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private static void postOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

}

class Node{
    int data;
    Node left;
    Node right;
}
