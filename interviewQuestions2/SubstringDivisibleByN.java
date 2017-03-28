/**
 * 
 */

/**
 * @author KSabbani
 * 
 */
public class SubstringDivisibleByN {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int n = 1088;
	printSubStrings(n);

    }

    private static void printSubStrings(int n) {
	if (n == 0) {
	    System.out.println(n);
	    return;
	}

	if (n % 8 == 0) {
	    n = n / 8;
	    printSubStrings(n);
	}

	System.out.print(n + ",");
    }

}
