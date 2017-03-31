package interviewQuestions;

public class Test {
    public static void main(String[] args) {
	int i = 15, j = 32;
	while (j != 0) {
	    int carry = i & j;

	    System.out.println(carry);
	    j = carry << 1;

	    System.out.println(j);
	}
    }
}
