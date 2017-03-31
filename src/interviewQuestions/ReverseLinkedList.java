/**
 * 
 */
package interviewQuestions;

/**
 * @author KSabbani
 * 
 */
public class ReverseLinkedList {

    private static class Node {
	int data;
	Node next;

	Node(int data) {
	    this.data = data;
	}
    }

    public static void main(String[] args) {
	Node head = new Node(1);

	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next = new Node(4);
	head.next.next.next.next = new Node(5);
	Node current = head;
	Node node = head;
	while (node != null) {
	    System.out.print(node.data + " ");
	    node = node.next;
	}

	// Node current = head;
	Node prev = null;
	Node next = null;

	while (current != null) {

	    next = current.next;
	    current.next = prev;
	    prev = current;
	    current = next;
	}
	System.out.println();
	Node revrseNode = prev;
	while (revrseNode != null) {
	    System.out.print(revrseNode.data + " ");
	    revrseNode = revrseNode.next;
	}

    }
}
