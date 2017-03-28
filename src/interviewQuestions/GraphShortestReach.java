package interviewQuestions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphShortestReach {

public static class Graph {
	 private Node[] nodes;
	 private static int DISTANCE = 6;
        private class Node{
        	int name ;
        	HashSet<Integer> neighbors = new HashSet<>();
        	Node(int data){
        		this.name = data;
        	}
        	
        	private void addNeighbor(int data){
        		this.neighbors.add(data);
        	}
        	
        	private boolean hasNeighbor(int neighbor){
        		for(int i : this.neighbors){
        			if(i==neighbor)
        				return true;
        		}
        		return false;
        	}
        }
        public Graph(int size) {
           nodes = new Node[size];
           for(int i=0;i<size;i++){
        	   nodes[i]= new Node(i);
           }
        }
        
        private Node getNode(int name){
        	return nodes[name];
        }

        public void addEdge(int first, int second) {
            Node n1 = getNode(first);
            Node n2 = getNode(second);
            n1.addNeighbor(n2.name);

            n2.addNeighbor(n1.name);
            
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            
        	LinkedList<Integer> queue = new LinkedList<>();
        	queue.add(startId);
        	int[] distances = new int[nodes.length];
        	Arrays.fill(distances, -1);
        	//current distance to same node
        	distances[startId] = 0;
        	while(!queue.isEmpty()){
        		int node = queue.poll();
        		
        		for(Integer neighbor: nodes[node].neighbors){
        			//check if neighbor has been visited or not if it is -1 not visited.
        			if(distances[neighbor]==-1){
        				distances[neighbor] = distances[node]+ DISTANCE;
        				
        				queue.add(neighbor);
        				
        			}
        		}
        		
        	}
        	
        	return null;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}
