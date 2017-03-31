/**
 * 
 */
package interviewQuestions;

/**
 * @author KSabbani
 * 
 */
public class Prin2dArrayInSpiral {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	printinSprial(a, 3, 3);
    }

    private static void printinSprial(int[][] a, int row, int col) {
	int l, r, b, t;
	t = 0;
	r = col;
	l = 0;
	b = row;
	int dir = 0;// 0 up; 1 down;2 left;3 right;

	while (t <= b && l <= r) {
	    if (dir == 0) {
		for (int i = t; i <= r; i++) {
		    System.out.print(a[t][i] + " ");
		}
		dir = 1;
		t++;
	    } else if (dir == 1) {

		for (int i = t; i <= r; i++) {
		    System.out.print(a[i][r] + " ");
		}
		r--;
		dir = 2;
	    } else if (dir == 2) {
		for (int i = r; i >= l; i--) {
		    System.out.print(a[b][i] + " ");
		}
		b--;
		dir = 3;
	    } else if (dir == 3) {
		for (int i = b; i >= t; i--) {
		    System.out.print(a[i][l] + " ");
		}
		l++;
		dir = 0;
	    }

	}

    }

}
