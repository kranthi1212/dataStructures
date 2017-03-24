package interviewQuestions;
import java.util.List;
import java.util.ArrayList;

public class BalanceGivenBST {
	Node root;

	public static void main(String[] args) {
		BalanceGivenBST tree = new BalanceGivenBST();

		tree.root = new Node(20);
		tree.root.left = new Node(10);
		tree.root.left.left = new Node(8);
		tree.root.left.left.left = new Node(7);
		tree.root.left.left.left.left = new Node(6);
		tree.root.left.left.left.left.left = new Node(5);
		// inorderTraverse(tree);
		tree.balanceBst(tree.root);
		tree.preorderTraverse(tree.root);
	}

	@SuppressWarnings("unused")
	private  void inorderTraverse(Node tree) {
		if (tree == null)
			return;
		inorderTraverse(tree.left);
		System.out.println(tree.data);
		inorderTraverse(tree.right);
	}

	private  void preorderTraverse(Node tree) {
		if (tree == null)
			return;
		System.out.println(tree.data);
		preorderTraverse(tree.left);
		preorderTraverse(tree.right);
	}

	private  void storeBstInList(List<Node> list, Node node) {
		if (node == null)
			return;
		storeBstInList(list, node.left);
		list.add(node);
		storeBstInList(list, node.right);
	}

	private void balanceBst(Node tree) {
		if (tree == null)
			return;
		List<Node> list = new ArrayList<Node>();
		storeBstInList(list, tree);
		int size = list.size();
		balanceBstUtil(list, 0, size - 1);
	}

	private  Node balanceBstUtil(List<Node> nodes, int start, int end) {
		if (start > end)
			return null;

		if (start > end)
			return null;

		/* Get the middle element and make it root */
		int mid = (start + end) / 2;
		Node node = nodes.get(mid);

		/*
		 * Using index in Inorder traversal, construct left and right subtress
		 */
		node.left = balanceBstUtil(nodes, start, mid - 1);
		node.right = balanceBstUtil(nodes, mid + 1, end);

		return node;
	}

}
