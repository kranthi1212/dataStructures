package interviewQuestions;

public class MaxConsecutive1s {

    public static void main(String[] args) {

	int[] a = { 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 };
	int max = 0;
	int count = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == 1)
		count++;

	    if (count > max) {
		max = count;
	    }

	    if (a[i] == 0)
		count = 0;
	}
	System.out.println("Max consecutive 1's = " + max);

    }

}
