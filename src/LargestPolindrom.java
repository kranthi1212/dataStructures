public class LargestPolindrom {

    public static void main(String[] arg) {
	int arr[] = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
	int n = arr.length;
	int x = 35, k = 4;
	System.out.println(findCrossOver(arr, 0, n - 1, 35));
    }

    static int findCrossOver(int arr[], int low, int high, int x) {
	// Base cases
	if (arr[high] <= x) // x is greater than all
	    return high;
	if (arr[low] > x) // x is smaller than all
	    return low;

	// Find the middle point
	int mid = (low + high) / 2; /* low + (high - low)/2 */

	/* If x is same as middle element, then return mid */
	if (arr[mid] <= x && arr[mid + 1] > x)
	    return mid;

	/*
	 * If x is greater than arr[mid], then either arr[mid + 1] is ceiling of
	 * x or ceiling lies in arr[mid+1...high]
	 */
	if (arr[mid] < x)
	    return findCrossOver(arr, mid + 1, high, x);

	return findCrossOver(arr, low, mid - 1, x);
    }
}
