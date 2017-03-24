import java.util.Arrays;
import java.util.Scanner;

public class IcecreamParlorSolution {

    public static int binarySearch(int first, int last, IceCream[] arr, int search) {

	while (first < last) {
	    int mid = (last - first) / 2;

	    if (search < arr[mid].flavor) {
		last = mid - 1;
	    } else if (search > arr[mid].flavor) {
		first = mid + 1;
	    }
	    return mid;
	}

	return -1;
	// Arrays.binarySearch(arr,first,last,search);
    }

    public static void main(String[] args) {

	int t;
	int n, m;

	Scanner in = new Scanner(System.in);
	t = in.nextInt();
	for (int test = 0; test < t; test++) {

	    m = in.nextInt();
	    n = in.nextInt();
	    IceCream[] arr = new IceCream[n];

	    for (int i = 0; i < n; i++)
		arr[i] = new IceCream(in.nextInt(), i + 1);

	    Arrays.sort(arr);
	    int firstIndex = 100000, secondIndex = 100000;
	    for (int i = 0; i < n - 1; i++) {
		int search = m - arr[i].flavor;
		if (search >= arr[i].flavor) {
		    int index = binarySearch(i + 1, n - 1, arr, search);
		    if (index != -1) {
			System.out.println(Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
			break;

		    }
		}
	    }

	}

    }

}

class IceCream implements Comparable {
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
	this.flavor = flavor;
	this.index = index;
    }

    @Override
    public int compareTo(Object o) {
	IceCream iceCream = (IceCream) o;
	if (iceCream.flavor > this.flavor)
	    return 1;
	if (iceCream.flavor < this.flavor)
	    return -1;
	return 0;
    }

    @Override
    public boolean equals(Object o) {
	IceCream iceCream = (IceCream) o;
	if (iceCream.flavor == this.flavor && iceCream.index == this.index)
	    return true;
	return false;
    }

}
