package interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SparseArray {

    public static void main(String[] args) {
	Map<String, Integer> resultsCache = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	int n = scan.nextInt();
	scan.nextLine();
	for (int i = 1; i <= n; i++) {
	    System.out.println("Enter input string : ");
	    String s = scan.nextLine();
	    if (resultsCache.containsKey(s)) {

		resultsCache.put(s, resultsCache.get(s) + 1);
	    } else {
		resultsCache.put(s, 1);
	    }
	}
	System.out.println("Enter q");

	int q = scan.nextInt();

	List<String> findMes = new ArrayList<>();
	scan.nextLine();
	for (int j = 1; j <= q; j++) {
	    System.out.println("Enter output string : ");
	    String r = scan.nextLine();
	    findMes.add(r);
	}

	for (String s : findMes) {
	    if (!resultsCache.containsKey(s)) {
		System.out.println(0);
	    } else {
		System.out.println(resultsCache.get(s));
	    }
	}
	scan.close();
    }
}
