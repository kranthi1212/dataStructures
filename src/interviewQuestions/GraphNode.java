/**
 * 
 */
package interviewQuestions;
import java.util.LinkedList;

/**
 * @author Kranthi
 *
 */
public class GraphNode {
	 int data;
	 LinkedList<GraphNode> child = new  LinkedList<>();
	 
	 GraphNode(int data){
		 this.data =  data;
	 }
}
