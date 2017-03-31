/**
 * 
 */
package interviewQuestions2;

/**
 * @author KSabbani
 * 
 * 
 *         http://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number
 *         -of-consecutive-1s-is-maximized/
 * 
 */
public class FlipZerosToOne {

    /**
     * @param args
     */
    public static void main(String[] args) {

	int a[] = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };

	int wL = 0;
	int wR = 0;
	int nZero = 0;
	int bestWindowWidth = -1;
	int m = 1;
	int bestWR = 0, bestWL = 0;

	while (wR < a.length - 1) {
	    // expand to the right, update '0' count:
	    if (nZero <= m) {
		wR++;
		if (a[wR] == 0)
		    nZero++;
	    }
	    ;

	    // shrink from left, update '0' count:
	    if (nZero > m) {
		if (a[wL] == 0)
		    nZero--;
		wL++;
	    }
	    ;

	    // update best window:
	    if (wR - wL > bestWindowWidth) {
		bestWindowWidth = wR - wL;
		bestWR = wR;
		bestWL = wL;
	    }
	}
	System.out.println(bestWindowWidth + " , " + bestWR + " , " + bestWL);
    }

}
