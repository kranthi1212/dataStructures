package interviewQuestions2;
public class ConnectedMatrix {

    public static void main(String[] args) {

	// int a[][] = { { 0, 0, 0, 1, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0 }, { 1,
	// 1, 0, 1, 0, 0, 1 },
	// { 0, 0, 0, 0, 0, 1, 0 }, { 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0,
	// 0 } };

	int a[][] = { { 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1 } };

	System.out.println(getBiggestRegion(a));
    }

    private static int getBiggestRegion(int[][] a) {

	int maxRegion = 0;
	for (int row = 0; row < a.length; row++) {
	    for (int column = 0; column < a[row].length; column++) {
		if (a[row][column] == 1) {
		    int size = getMaxRegion(a, row, column);
		    maxRegion = Math.max(maxRegion, size);
		}
	    }
	}
	return maxRegion;
    }

    private static int getMaxRegion(int[][] a, int row, int column) {
	// boundary checks
	if (row < 0 || column < 0 || row >= a.length || column >= a[row].length) {
	    return 0;
	}
	// check actually part of the region 1.e if a[][] ==1 is a region
	if (a[row][column] == 0)
	    return 0;

	// clear it.This will check for is visted check for dfs and also skips
	// reagion search on line 19 if statement
	a[row][column] = 0;

	// size of self
	int size = 1;
	// 8 diff direction to check connected
	for (int i = row - 1; i <= row + 1; i++) {
	    for (int j = column - 1; j <= column + 1; j++) {
		// dont search myself skip it
		if (i != row || j != column)
		    size += getMaxRegion(a, i, j);
	    }
	}

	return size;
    }
}
