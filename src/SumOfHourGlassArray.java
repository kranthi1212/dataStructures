package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumOfHourGlassArray {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int arr[][] = new int[6][6];
	for (int arr_i = 0; arr_i < 6; arr_i++) {
	    for (int arr_j = 0; arr_j < 6; arr_j++) {
		arr[arr_i][arr_j] = in.nextInt();
	    }
	}
	int l = 0, x = 0, r = 3, max = 3, t = 3, limit = 2;
	List<Integer> list = new ArrayList<>();
	List<int[][]> listArray = new ArrayList<int[][]>();

	for (int k = 0; k <= 3; k++) {

	    for (int j = 0; j <= max; j++) {
		int sum = 0;
		int temp[][] = new int[3][3];
		int a = 0;
		while (l != t) {
		    int b = 0;
		    for (int i = j; i < r; i++) {
			temp[a][b] = arr[l][i];
			b++;
		    }
		    l++;
		    a++;
		}
		r++;
		l = x;
		list.add(sum);
	    }
	    r = 3;
	    x++;
	    l = x;
	    t++;
	}

	for (int[][] array : listArray) {
	    int sum = 0;
	    for (int i = 0; i <= 2; i++) {
		for (int j = 0; j <= 2; j++) {
		    if ((i == 1 && j == 0) || (i == 1 && j == 2)) {
			continue;
		    } else {
			System.out.print(array[i][j] + " ");
			sum += array[i][j];
		    }
		}
	    }
	    list.add(sum);
	}
	Collections.sort(list);
	System.out.println(list.get(list.size() - 1));
    }
}
