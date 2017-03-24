public class MaxConsecutiveChar {

    public static void main(String[] arg) {
	String s = "ffggggggggggtvshjsdhjfffffffffhvjbjcharu";
	int count = 1;
	int maxCount = 0;

	for (int i = 1; i < s.length(); i++) {

	    if (s.charAt(i - 1) == s.charAt(i)) {
		count++;
	    }
	    if ((s.charAt(i - 1) != s.charAt(i)) && count > maxCount) {

		maxCount = count;
		count = 1;
	    }

	}

	System.out.println("Maxcount =" + maxCount);
    }

}
