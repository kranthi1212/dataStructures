/**
 * 
 */


/**
 * @author KSabbani
 * 
 */
public class MinimumDepthInBinaryTree {

    private static class Node {
	int data;
	Node left, right;

	Node(int data) {
	    this.data = data;
	    left = right = null;
	}

    }

    public static void main(String[] args) {
	Node root = new Node(1);
	root.left = new Node(2);
	// root.right = new Node(3);
	// root.left.left = new Node(4);
	// root.left.right = new Node(5);

	MinimumDepthInBinaryTree minDepth = new MinimumDepthInBinaryTree();
	minDepth.findMinDepth(root);

    }

    private void findMinDepth(Node root) {
	int minLeftDepth = this.findMinDepth1(root);
	System.out.println("MinDepth = " + minLeftDepth);
    }

    private int findMinDepth1(Node root) {
	// Corner case. Should never be hit unless the code is
	// called on root = NULL
	if (root == null)
	    return 0;

	// Base case : Leaf Node. This accounts for height = 1.
	if (root.left == null && root.right == null)
	    return 1;

	// If left subtree is NULL, recur for right subtree
	if (root.left == null)
	    return findMinDepth1(root.right) + 1;

	// If right subtree is NULL, recur for right subtree
	if (root.right == null)
	    return findMinDepth1(root.left) + 1;

	return Math.min(findMinDepth1(root.left), findMinDepth1(root.right)) + 1;

    }
}
