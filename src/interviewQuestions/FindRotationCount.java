/**
 * 
 */
package interviewQuestions;

/**
 * @author KSabbani
 * 
 */
public class FindRotationCount {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] array = { 12, 15, 18, 2, 5, 6, 8, 11 };

	int count = findNumberOfRotations(array);
	System.out.println(count);

    }

    private static int findNumberOfRotations(int[] a) {

	int low = 0, high = a.length - 1;
	int n = a.length - 1;
	// int mid = high +0)

	while (low <= high) {

	    if (a[low] <= a[high]) {
		return low;
	    }
	    int mid = (low + high) / 2;
	    int next = (mid + 1) % n;
	    int prev = (mid + n - 1) % n;

	    if (a[mid] <= next && a[mid] <= prev) {
		return mid;
	    }
	    if (a[mid] <= a[low]) {
		high = mid - 1;
	    }
	    if (a[mid] >= a[high]) {
		low = mid + 1;
	    }

	}

	return -1;
    }
}
