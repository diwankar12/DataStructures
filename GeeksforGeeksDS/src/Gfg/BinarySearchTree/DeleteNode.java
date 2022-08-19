package Gfg.BinarySearchTree;


import Gfg.Tree.Impl.Node;

public class DeleteNode {
    // Return the root of the modified BST after deleting the node with value X
    public static Node deleteNode(Node root, int x) {

        // search node
        if (root == null) {
            return null;
        }

        if (root.data == x) {
            return replace(root);
        } else if (root.data > x) {
            root.left = deleteNode(root.left, x);
        } else {
            root.right = deleteNode(root.right, x);
        }
        return root;
    }

    public static Node replace(Node root) {
        if (root.left == null && root.right == null) {
            return null;
        } else if (root.left != null) {
            return root.left;
        } else if (root.right != null) {
            return root.right;
        } else {

            Node tempNode = traverse(root.right);
            root.data = tempNode.data;
            root.right = deleteNode(root.right, tempNode.data);
            return root;


        }

    }


    public static Node traverse(Node root) {

        if (root.right == null && root.left == null) {
            return root;
        }

        Node tempNode = traverse(root.left);

        return tempNode;

    }


}