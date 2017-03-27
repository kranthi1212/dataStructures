/**
 * 
 */
package interviewQuestions;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Kranthi
 *
 */
public class Graph {

	private boolean hasPath(GraphNode src, GraphNode dest) {
		if (src == null || dest == null)
			return false;
		HashSet<Integer> visited = new HashSet<>();
		return hasDFSPath(src, dest, visited);

	}

	private boolean hasDFSPath(GraphNode src, GraphNode dest, HashSet<Integer> visited) {
		
		if(visited.contains(src.data))
			return false;
		visited.add(src.data);
		if(src.data == dest.data)
			return true;
		
		for(GraphNode node : src.child){
			if(hasDFSPath(node, dest, visited)){
				return true;
			}
		}
		return false;
	}
	
	private boolean hasBFSPath(GraphNode src, GraphNode dest) {
		if (src == null || dest == null)
			return false;
		HashSet<Integer> visited = new HashSet<>();
		return hasBFSPath(src, dest, visited);

	}

	private boolean hasBFSPath(GraphNode src,GraphNode dest,HashSet<Integer> visited){
		LinkedList<GraphNode> queue = new  LinkedList<>();
		queue.add(dest);
		
		while(!queue.isEmpty()){
			if(visited.contains(src.data)){
				return false;
			}
			
			GraphNode node = queue.remove();
			
			if(node.data == dest.data){
				return true;
			}
			
			visited.add(src.data);
			for(GraphNode n: src.child){
				queue.add(n);
			}
			
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.hasPath(new GraphNode(3), new GraphNode(4));
	}

}
