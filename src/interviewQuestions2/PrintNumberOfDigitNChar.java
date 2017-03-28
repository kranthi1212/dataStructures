package interviewQuestions2;
/**
 * 
 */

/**
 * @author KSabbani
 * 
 */
public class PrintNumberOfDigitNChar {

    public static void main(String[] args) {

	String s = "a5$&45NdG";
	int charCount = 0;
	int digitCount = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (Character.isDigit(s.charAt(i))) {
		digitCount++;
	    } else if (Character.isAlphabetic(s.charAt(i))) {
		charCount++;
	    }
	}
	System.out.println("Alphabet# = " + charCount + "\nDigits# = " + digitCount);
    }
}