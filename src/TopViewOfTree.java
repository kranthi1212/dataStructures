public class TopViewOfTree {

    public static class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
	    this.data = data;
	    left = null;
	    right = null;
	}
    }

    public static void main(String[] arg) {
	TreeNode root = createBST();
	inOrder(root);
	System.out.println(isBst(root));
	showTopView(root);
    }

    static void inOrder(TreeNode node) {
	if (node == null)
	    return;
	inOrder(node.left);
	System.out.print(node.data + " ");
	inOrder(node.right);
    }

    static TreeNode createBST() {

	TreeNode root = null;
	for (int i = 1; i <= 10; i++)
	    root = insert(root, i);

	return root;
    }

    static TreeNode insert(TreeNode node, int data) {
	if (node == null)
	    return new TreeNode(data);

	if (data <= node.data)
	    node.left = insert(node.left, data);
	else if (data > node.data)
	    node.right = insert(node.right, data);
	return node;
    }

    static boolean isBst(TreeNode node) {

	return isBstUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBstUtil(TreeNode node, int min, int max) {

	if (node == null)
	    return true;
	if (node.data > min && node.data < max && isBstUtil(node.left, min, node.data)
		&& isBstUtil(node.right, node.data, max))
	    return true;
	return false;

    }

    static void showTopView(TreeNode root) {
	if (root == null)
	    return;
	showLeft(root.left);
	System.out.print(" " + root.data + " ");
	showLeft(root.right);

    }

    static void showLeft(TreeNode node) {
	if (node == null)
	    return;
	System.out.print(" " + node.data + " ");
	showLeft(node.left);
    }

    static void showRoot(TreeNode node) {
	if (node == null)
	    return;
	System.out.println(node.data);

    }

    static void showRight(TreeNode node) {
	if (node == null)
	    return;
	System.out.print(" " + node.data + " ");
	showRight(node.right);
    }

}
