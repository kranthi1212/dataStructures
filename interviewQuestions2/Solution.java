package interviewQuestions2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
	magazineMap = new HashMap<>();
	noteMap = new HashMap<>();

	String magazineWords[] = magazine.split("\\s+");
	String noteWords[] = note.split("\\s+");

	for (String s : magazineWords) {
	    Integer i = magazineMap.get(s);
	    if (!magazineMap.containsKey(s)) {
		magazineMap.put(s, 1);
	    } else {
		magazineMap.put(s, i + 1);
	    }
	}

	for (String s : noteWords) {
	    Integer i = noteMap.get(s);
	    if (!noteMap.containsKey(s)) {
		noteMap.put(s, 1);
	    } else {
		noteMap.put(s, i + 1);
	    }
	}

    }

    public boolean solve() {

	for (String s : noteMap.keySet()) {
	    if (noteMap.get(s) > magazineMap.get(s))
		return false;
	}

	return true;

    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int m = scanner.nextInt();
	int n = scanner.nextInt();

	// Eat whitespace to beginning of next line
	scanner.nextLine();

	Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
	scanner.close();

	boolean answer = s.solve();
	if (answer)
	    System.out.println("Yes");
	else
	    System.out.println("No");

    }
}
