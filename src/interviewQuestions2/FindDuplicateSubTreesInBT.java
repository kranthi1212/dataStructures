/**
 * 
 */
package interviewQuestions2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author KSabbani
 * 
 */
public class FindDuplicateSubTreesInBT {

    private static class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
	    this.data = data;
	    left = right = null;
	}
    }

    public static void main(String[] args) {
	// TreeNode root = new TreeNode(1);
	// TreeNode two = new TreeNode(2);
	// TreeNode three = new TreeNode(3);
	// TreeNode four1 = new TreeNode(4);
	// TreeNode four2 = new TreeNode(4);
	// TreeNode four3 = new TreeNode(4);
	// TreeNode two2 = new root(2);
	// root.left = two;
	// root.right = three;
	// three.left = two2;
	// three.right = four3;
	// two2.left = four2;
	// two.left = four1;

	TreeNode root = new TreeNode(1);
	root.left = new TreeNode(2);
	root.left.left = new TreeNode(4);
	root.right = new TreeNode(3);
	root.right.left = new TreeNode(2);
	root.right.left.left = new TreeNode(4);
	root.right.right = new TreeNode(4);
	findAllDupes(root);

    }

    private static void findAllDupes(TreeNode root) {

	Set<String> results = new HashSet<>();
	Map<String, Integer> map = new HashMap<>();

	findAllDupes(root, map, results);

	for (String s : results) {
	    System.out.println(s.replace("-", " ")
		    .replace("N", ""));
	}
    }

    private static String findAllDupes(TreeNode root, Map<String, Integer> map, Set<String> results) {
	if (root == null)
	    return "N";

	String signature = root.data + "-";
	String s1 = findAllDupes(root.left, map, results);
	String s2 = findAllDupes(root.right, map, results);
	signature = signature + s1 + s2;
	if (map.containsKey(signature)) {
	    results.add(signature);
	}
	map.put(signature, 1);
	return signature;

    }

}
