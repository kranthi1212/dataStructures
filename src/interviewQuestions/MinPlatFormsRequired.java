package interviewQuestions;

import java.util.Arrays;

/**
 * @author KSabbani {@link http
 *         ://www.geeksforgeeks.org/minimum-number-platforms-
 *         required-railwaybus-station/}
 */
public class MinPlatFormsRequired {

    public static void main(String[] args) {
	int a[] = { 1, 2, 10, 5, 5 };
	int d[] = { 4, 5, 12, 9, 12 };
	Arrays.sort(a);
	Arrays.sort(d);
	int i = 1;
	int j = 0;
	int count = 1;
	int max = 0;
	int n = a.length;
	int day = a[i];
	while (i < n && j < n) {

	    if (a[i] <= d[j]) {
		count++;
		i++;
		if (count <= max) {
		    max = count;
		    day = a[i];
		}
	    } else {
		count--;
		j++;
	    }
	}
	System.out.println(count);
    }

}
