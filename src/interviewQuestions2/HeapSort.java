package interviewQuestions2;

public class HeapSort {
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    public static void sortMaxHeap(int[] a) {
	System.out.println("MaxHeap");
	n = a.length;
	for (int i = n / 2 - 1; i >= 0; i--) {
	    maxHeap(a, i, n);
	}
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
	for (int i = n - 1; i >= 0; i--) {
	    int t = a[0];
	    a[0] = a[i];
	    a[i] = t;
	    maxHeap(a, 0, i);
	}
    }

    public static void maxHeap(int[] a, int i, int n) {

	left = 2 * i + 1;
	right = 2 * i + 2;
	largest = i;

	if (left < n && a[largest] < a[left])
	    largest = left;
	if (right < n && a[largest] < a[right])
	    largest = right;

	if (i != largest) {
	    int t = a[i];
	    a[i] = a[largest];
	    a[largest] = t;

	    maxHeap(a, largest, n);
	}

    }

    public static void sortMinHeap(int[] a) {

	System.out.println("\n\nMinHeap");

	n = a.length;
	for (int i = 0; i <= n / 2 - 1; i++) {
	    minHeap(a, i, n);
	}

	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
	for (int i = n - 1; i >= 0; i--) {

	    int t = a[0];
	    a[0] = a[i];
	    a[i] = t;

	    minHeap(a, 0, i);
	}
    }

    public static void minHeap(int[] a, int i, int n) {
	int smallest = i;
	left = 2 * i + 1;
	right = 2 * i + 2;

	if (left < n && a[left] < a[smallest])
	    smallest = left;
	if (right < n && a[right] < a[smallest])
	    smallest = right;

	if (i != smallest) {
	    int t = a[i];
	    a[i] = a[smallest];
	    a[smallest] = t;
	    minHeap(a, smallest, n);
	}

    }

    public static void main(String[] args) {
	int[] a1 = { 4, 1, 0, 3, 2, 16, 9, 10, 14, 6, 8, 7, 5, 100, 16, 19, 21, 49, -49 };
	sortMaxHeap(a1);
	System.out.println();
	for (int i = 0; i < a1.length; i++) {
	    System.out.print(a1[i] + " ");
	}

	int[] a2 = { 4, 1, 0, 3, 2, 16, 9, 10, 6, 14, 8, 7, 5, 100, 16, 19, 21, 49 };
	sortMinHeap(a2);
	System.out.println();
	for (int i = 0; i < a2.length; i++) {
	    System.out.print(a2[i] + " ");
	}

    }
}
