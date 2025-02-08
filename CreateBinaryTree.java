
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class Tree {
    int i = -1;

    public Node buildTree(int arr[]) {
        i++;
        if (i >= arr.length || arr[i] == -1) { 
            return null;
        }
        Node newNode = new Node(arr[i]);  
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        return newNode;
    }
}

public class CreateBinaryTree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree t1 = new Tree();
        Node root = t1.buildTree(arr); // Root node of the constructed tree
    }
}
