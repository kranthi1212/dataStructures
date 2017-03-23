package src;
public class LargestSubArraySum {

    public static void main(String[] args) {
	int max_so_far = Integer.MIN_VALUE;
	int max_ending_here = 0;
	int starting_index = 0;
	int ending_index = 0;
	int[] a = { -2, -3, 2, -1, -2, 1, 5, -3 };

	for (int i = 0; i < a.length; i++) {

	    max_ending_here = max_ending_here + a[i];

	    if (max_ending_here < 0) {
		max_ending_here = 0;
		starting_index = i;
	    }
	    if (max_so_far < max_ending_here) {
		max_so_far = max_ending_here;
		ending_index = i;
	    }
	}
	int sum = 0;
	for (int j = starting_index + 1; j < ending_index + 1; j++) {
	    System.out.print(a[j]);
	    System.out.print(j == ending_index ? " = " : " + ");
	    sum += a[j];
	}

	System.out.print(sum);
    }
}
