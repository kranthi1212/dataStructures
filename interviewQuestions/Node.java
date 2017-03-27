package interviewQuestions;

/**
 * @author Kranthi
 *
 */
public class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data =data;
		this.left =null;
		this.right = null;
	}
	@Override
	public String toString(){
		return this.data ==0 ? "no value" : String.valueOf(this.data);
	}
}
