/**
 * 
 */
package interviewQuestions;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Kranthi
 *
 */
public class MergingKSortedArray {

	private static int[] mergeArrays(int[][] arrays) {

		PriorityQueue<QueueNode> pq = new PriorityQueue<>();

		int totalSize = 0;
		for (int i = 0; i < arrays.length; i++) {
			totalSize += arrays[i].length;
			if (arrays[i].length > 0)
				pq.add(new QueueNode(arrays[i], 0, arrays[i][0]));
		}
		int[] results = new int[totalSize];
		for (int i = 0; !pq.isEmpty(); i++) {
			QueueNode n = pq.poll();
			results[i] = n.value;
			int newIndex = n.index+1;
			if(newIndex < n.array.length){
				pq.add(new QueueNode(n.array,newIndex,n.array[newIndex]));
			}
		}

		return results;
	}

	public static void main(String[] args) {
		int arrays[][] = { {11,12},{},{ 0, 3, 4, 7 }, { 1, 2, 9 }, { 5, 8, 10 } };
		int[] r = mergeArrays(arrays);
		for(int i=0;i<r.length;i++)
		System.out.println(r[i]);
	}
}

class QueueNode implements Comparable<QueueNode> {

	int value;
	int index;
	int[] array;

	public QueueNode(int[] array, int index, int value) {
		this.value = value;
		this.index = index;
		this.array = array;

	}

	@Override
	public int compareTo(QueueNode n) {
		if (this.value > n.value)
			return 1;
		if (this.value < n.value)
			return -1;
		return 0;
	}

}