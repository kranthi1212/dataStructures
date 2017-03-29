/**
 * 
 */
package interviewQuestions;

/**
 * @author KSabbani
 * 
 */
public class CycleInLinkedList {

    private static class Node {
	int data;
	Node next;

	Node(int data) {
	    this.data = data;
	    next = null;

	}
    }

    private boolean hasCycle(Node head) {
	if (head == null)
	    return false;
	Node fast = head.next;
	Node slow = head;

	while (fast != null && slow != null && fast.next != null) {

	    if (fast == slow)
		return true;

	    fast = fast.next.next;
	    slow = slow.next;

	}

	return false;
    }

    public static void main(String[] args) {
	CycleInLinkedList cycle = new CycleInLinkedList();

	Node head = new Node(0);
	head.next = new Node(1);
	head.next.next = new Node(1);
	head.next.next.next = new Node(0);
	head.next.next.next.next = new Node(1);
	System.out.println(cycle.hasCycle(head));

    }

}
