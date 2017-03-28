package interviewQuestions;

import java.util.Scanner;

/**
 * @author Kranthi
 * 
 */
public class PrintFirstnLastOccurrence {

    /**
     * @param args
     */
    public static void main(String[] args) {

	int[] a = { 1, 3, 5, 5, 5, 5, 5, 7, 123, 125 };

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter element ");
	int x = scan.nextInt();
	int firstOccurenceIndex = 0;
	int lastOccurenceIndex = 0;
	boolean flag = true;
	for (int i = 0; i < a.length; i++) {
	    if (flag && a[i] == x) {
		firstOccurenceIndex = i;
		flag = false;
	    }
	    if (a[i] > x) {
		lastOccurenceIndex = i - 1;
		break;
	    }
	}
	System.out.println("firstOccurenceIndex " + firstOccurenceIndex + "\t lastOccurenceIndex " + lastOccurenceIndex);
	scan.close();
    }

}
