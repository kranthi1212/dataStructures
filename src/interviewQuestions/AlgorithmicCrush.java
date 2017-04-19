package interviewQuestions;

import java.util.Scanner;

public class AlgorithmicCrush {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();

	if (n < 3 || n > Math.pow(10, 7)) {
	    scan.close();
	    throw new IllegalArgumentException("Invaild Value");
	}
	if (m < 1 || m > 2 * Math.pow(10, 5)) {
	    scan.close();
	    throw new IllegalArgumentException("Invaild Value");
	}
	long[] results = new long[n + 1];

	long max = Integer.MIN_VALUE;
	for (int j = 1; j <= m; j++) {
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int k = scan.nextInt();
	    results[a] += k;
	    if (b + 1 <= n)
		results[b + 1] -= k;

	}
	long x = 0;
	for (int i = 0; i < n; i++) {
	    x = x + results[i];
	    if (max < x)
		max = x;
	}
	scan.close();
	System.out.print(max);

    }

}
