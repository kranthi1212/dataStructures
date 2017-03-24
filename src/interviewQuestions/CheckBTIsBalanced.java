package interviewQuestions;
public class CheckBTIsBalanced {

	
    /* below is a unbalanced and balanced tree respectively
    		 1       1
   			/       / 
  		   2       2   
 		  /
		 3
	*/
	public static void main(String[] args) {
		Node n = new Node(1);
		n.left = new Node(2);
		//n.right = new Node(4);
		n.left.left = new Node(3);
		printTree(n);
		System.out.println(isTreeBalanced(n));

	}

	private static void printTree(Node n) {
		if(n==null) return ;
		System.out.println(n.data);
		printTree(n.left);
		printTree(n.right);
	}

	private static boolean isTreeBalanced(Node n) {
		if (balanceHeight(n) > -1)
			return true;
		return false;
	}

	private static int balanceHeight(Node n) {

		if (n == null)
			return 0;
		int h1 = balanceHeight(n.left);
		int h2 = balanceHeight(n.right);

		//if any of the subtree in in-balance i.e -1 return -1
		if (h1 == -1 || h2 == -1)
			return -1;
		//difference b/w hts of left tree and right subtree should not be more than 1
		if (Math.abs(h1 - h2) > 1)
			return -1;
	
		if (h1 > h2)
			return h1 + 1;
	//incrementing the ht bcoz adding node to the ht
		return h2 + 1;

	}

}

