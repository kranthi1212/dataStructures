package interviewQuestions2;

import java.util.HashMap;

public class LinkedListClone {

    static class Node {

	int data;
	Node next;
	Node random;

	Node(int data) {
	    this.data = data;
	    this.next = this.random = null;
	}

	Node(int data, Node next, Node arbitPtr) {
	    this.data = data;
	    this.next = next;
	    this.random = arbitPtr;
	}

	@Override
	public String toString() {
	    return String.valueOf(this.data);
	}

    }

    Node head;

    private void inOrderTravesal(Node head) {
	Node curr = head;
	while (curr != null) {
	    System.out.print("Curr Data " + curr.data + " Next Data " + curr.next + " Random Data " + curr.random
		    + "\n");
	    curr = curr.next;
	}
    }

    private Node cloneLinkedList() {
	HashMap<Node, Node> cache = new HashMap<>();
	Node curr = head;

	while (curr != null) {
	    cache.put(curr, new Node(curr.data, curr.next, curr.random));
	    curr = curr.next;
	}
	// curr = head;
	// for (Entry<Node, Node> e : cache.entrySet()) {
	// Node original = e.getKey();
	// Node clone = e.getValue();
	//
	// clone.next = original.next;
	// clone.arbitPtr = original.arbitPtr;
	//
	// }
	curr = head;
	return cache.get(curr);
    }

    public static void main(String[] args) {

	LinkedListClone list = new LinkedListClone();

	Node head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next = new Node(4);
	head.next.next.next.next = new Node(5);
	list.head = head;

	list.head.random = list.head.next.next;
	list.head.next.random = list.head.next.next.next;
	list.head.next.next.random = list.head.next.next.next.next;
	list.head.next.next.next.random = list.head.next.next.next.next.next;
	list.head.next.next.next.next.random = list.head.next;

	list.inOrderTravesal(head);
	System.out.println("\n");
	Node clone = list.cloneLinkedList();
	list.inOrderTravesal(clone);
    }

}
