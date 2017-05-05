package interviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSortGraph {

    int size = 0;
    // int visited[] = new int[size];
    LinkedList<Integer> adj[];

    public TopologicalSortGraph(int size) {
	this.size = size;
	adj = new LinkedList[size];
	for (int i = 0; i < size; i++) {
	    adj[i] = new LinkedList<>();
	}
    }

    public void addEdge(int v, int u) {
	adj[v].add(u);
    }

    public void topologySort() {
	Stack<Integer> stack = new Stack<>();
	boolean[] visited = new boolean[size];
	Arrays.fill(visited, false);

	for (int i = 0; i < size; i++) {
	    if (visited[i] == false)
		topologySortUtil(visited, stack, i);
	}

    }

    public void topologySortUtil(boolean[] visited, Stack<Integer> stack, int v) {

	visited[v] = true;

    }

    public static void main(String[] args) {

	TopologicalSortGraph graph = new TopologicalSortGraph(6);

	graph.addEdge(5, 0);
	graph.addEdge(5, 2);
	graph.addEdge(4, 0);
	graph.addEdge(4, 1);
	graph.addEdge(2, 3);
	graph.addEdge(3, 1);
	graph.topologySort();

    }

}
