package interviewQuestions2;
public class PrintNodesAtKDistanceFromRoot {

    private static class Node {
	int data;
	Node left;
	Node right;

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
	root.left.right = new Node(5);
	root.right.left = new Node(8);
	getNodesAtK(2, root);

    }

    private static void getNodesAtK(int k, Node root) {

	if (root == null)
	    return;
	if (k == 0) {
	    System.out.println(root.data + " ");
	    return;
	} else {
	    getNodesAtK(k - 1, root.left);
	    getNodesAtK(k - 1, root.right);

	}

    }
}
