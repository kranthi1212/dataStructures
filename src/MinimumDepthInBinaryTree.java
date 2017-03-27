/**
 * 
 */
package src;

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
	root.right = new Node(3);
	root.left.left = new Node(4);
	// root.left.right = new Node(5);

	MinimumDepthInBinaryTree minDepth = new MinimumDepthInBinaryTree();
	minDepth.findMinDepth(root);

    }

    private void findMinDepth(Node root) {
	int minLeftDepth = this.findMinDepth1(root, 0);
	// int minRightDepth = this.findMinDepth1(root.right, 0);
	System.out.println("MinDepth = " + minLeftDepth);
    }

    private int findMinDepth1(Node root, int k) {
	if (root == null)
	    return k;
	if (root.right == null)
	    return findMinDepth1(root.left, k + 1);
	if (root.left == null)
	    return findMinDepth1(root.right, k + 1);

	return Math.min(findMinDepth1(root.left, k + 1), findMinDepth1(root.right, k + 1));

    }
}
