package interviewQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	static int[] results;

	public static int fibonacci(int n) {
		// Complete the function.
		if (results[n] != -1) {
			return results[n];
		}
		results[n] = fibonacci(n - 1) + fibonacci(n - 2);
		return results[n];

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		results = new int[n+1];
		Arrays.fill(results, -1);
		results[0] = 0;
		results[1] = 1;
		System.out.println(fibonacci(n));
	}
}