package interviewQuestions;
public class NaryTreeMirrorCheck {
	Node tree1;
	Node tree2;
	
	public static void main(String[] args){
		NaryTreeMirrorCheck mirror = new  NaryTreeMirrorCheck();
		
		mirror.tree1 = new Node(1);
		mirror.tree1.left = new Node(2);
		mirror.tree1.right = new Node(3);
		
		mirror.tree2 = new Node(1);
		mirror.tree2.left = new Node(5);
		mirror.tree2.right = new Node(2);
		
		
		System.out.println(mirror.isMirrorsUtil(mirror.tree1,mirror.tree2));
	}
	
	
	
	private boolean isMirrorsUtil(Node root1,Node root2){
		if(root1 == null && root2 == null)
		 return true;
		
		 if(isMirrorsUtil(root1.left, root2.right)){
			 if(root1.data == root2.data)
				 return true; 
				 return false;
		 }
		if(isMirrorsUtil(root1.right, root2.left)){
			if(root1.data == root2.data)
				 return true; 
				 return false;
		}
		
		return false;
	}
	
	
}
