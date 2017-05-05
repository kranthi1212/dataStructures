package interviewQuestions2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphShorestreach {

    public static class Node {
	int data;
	LinkedList<Node> neighbors = new LinkedList<Node>();

	Node(int data) {
	    this.data = data;
	}
    }

    public static class Graph {
	public static Node[] nodes;
	public static final int DISTANCE = 6;
	public static int n = 0;

	public Graph(int size) {
	    if (size < 2 && size > 1000)
		throw new IllegalArgumentException("Invalid graph size");
	    n = size;
	    nodes = new Node[size];
	}

	private Node getNode(int id) {
	    for (int i = 0; i < n; i++) {
		if (nodes[i].data == id)
		    return nodes[i];
	    }
	    return null;
	}

	public void addEdge(int first, int second) {

	    Node n1 = getNode(first);
	    if (n1 == null) {
		n1 = new Node(first);
		nodes[first] = n1;
	    }
	    Node n2 = getNode(second);
	    if (n2 == null) {
		n2 = new Node(second);
		nodes[second] = n2;
	    }

	    n1.neighbors.add(n2);
	    n2.neighbors.add(n1);

	}

	public int[] shortestReach(int startId) { // 0 indexed
	    LinkedList<Integer> queue = new LinkedList<>();
	    queue.add(startId);

	    int[] distance = new int[nodes.length];
	    Arrays.fill(distance, -1);
	    distance[startId] = 0;
	    while (!queue.isEmpty()) {
		int node = queue.poll();

		for (Node neighbor : nodes[node].neighbors) {
		    if (distance[neighbor.data] == -1) {
			distance[neighbor.data] = distance[node] + DISTANCE;
		    }

		}
	    }
	    return distance;
	}

    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	// int queries = scanner.nextInt();

	// for (int t = 0; t < queries; t++) {

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
	// }

	scanner.close();
    }
}
