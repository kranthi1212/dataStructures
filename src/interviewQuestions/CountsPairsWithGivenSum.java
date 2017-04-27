package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountsPairsWithGivenSum {

    public static void main(String args[]) {
	int[] arr = { 1, 5, 7, -1 };
	int sum = 6;
	getPairsCount(arr, sum);
    }

    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] a, int x) {

	int arrayLength = a.length;
	HashMap<Integer, Integer> hashMapedArray = new HashMap<Integer, Integer>();

	int temp1 = 0;

	for (int i = 0; i < arrayLength; i++) {
	    if (hashMapedArray.containsKey(a[i])) {
		temp1 = hashMapedArray.get(a[i]) + 1;
		hashMapedArray.put(a[i], temp1);
	    } else {
		hashMapedArray.put(a[i], 1);
	    }
	}
	for (Map.Entry<Integer, Integer> entry : hashMapedArray.entrySet()) {
	    System.out.println(entry.getKey() + " : " + entry.getValue());
	}

	int temp3TwiceCount = 0;
	int max = 0;
	for (int j = 0; j < arrayLength; j++) {
	    if (hashMapedArray.get(x - a[j]) != null) {
		temp3TwiceCount += hashMapedArray.get(x - a[j]);
		if (x - a[j] == a[j]) {
		    temp3TwiceCount--;
		}
	    }
	    int i = temp3TwiceCount / 2;
	    if (i > max)
		max = i;
	}
	System.out.println("count of pairs is =" + max);
    }
}