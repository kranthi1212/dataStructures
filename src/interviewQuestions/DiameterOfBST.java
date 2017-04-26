package interviewQuestions;

public class DiameterOfBST {

    static class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
	    this.data = data;
	    this.left = this.right = null;

	}
    }

    public static void main(String[] args) {

	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);

	System.out.println(findDiameter(root));
    }

    static int findDiameter(Node root) {
	int leftHt = findDiameter(root.left, 1);
	int rightHt = findDiameter(root.right, 0);
	return leftHt + rightHt;
    }

    static int findDiameter(Node root, int ht) {
	if (root == null)
	    return ht;

	ht += 1;
	int leftHt = findDiameter(root.left, ht);
	int rightHt = findDiameter(root.right, ht);
	return Math.max(leftHt, rightHt);
    }

}
