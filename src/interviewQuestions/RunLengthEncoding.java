/**
 * 
 */
package interviewQuestions;

/**
 * @author KSabbani
 * 
 */
public class RunLengthEncoding {

    public static void main(String ars[]) {
	String str = "wwwwaaadexxxxxx-";
	String encoded = "";
	char temp = str.charAt(0);
	int count = 1;
	for (int i = 1; i < str.length(); i++) {
	    char currentChar = str.charAt(i);
	    if (temp == currentChar)
		count++;
	    else if (temp != currentChar || currentChar == '-') {
		encoded += temp + String.valueOf(count);
		temp = currentChar;
		count = 1;
	    }

	}
	System.out.println(encoded);
    }
}
