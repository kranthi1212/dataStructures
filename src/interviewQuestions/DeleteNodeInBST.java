/**
 * 
 */
package interviewQuestions;

/**
 * @author KSabbani
 * 
 */
public class DeleteNodeInBST {

    private static class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
	    this.data = data;
	    left = right = null;
	}

    }

    public static TreeNode createBinarySearchTree() {
	TreeNode rootNode = new TreeNode(40);
	rootNode.left = new TreeNode(20);
	rootNode.left.left = new TreeNode(10);
	rootNode.left.right = new TreeNode(30);
	rootNode.right = new TreeNode(60);
	rootNode.right.left = new TreeNode(50);
	rootNode.right.right = new TreeNode(70);
	rootNode.left.left.left = new TreeNode(5);
	rootNode.left.left.right = new TreeNode(13);
	rootNode.right.left.right = new TreeNode(55);
	return rootNode;
    }

    public static void main(String[] args) {
	TreeNode root = createBinarySearchTree();

    }

}
