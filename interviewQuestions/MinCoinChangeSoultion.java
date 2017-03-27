package interviewQuestions;
/**
 * @author Kranthi
 *
 */

public class MinCoinChangeSoultion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] coins = {9, 6, 5, 1};
		int changeFor = 11;
		System.out.println(minChange(changeFor, coins));
	}

	private static int minChange(int changeFor, int[] coins) {

		int reminder = 0;
		int results = 0;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] > changeFor)
				continue;
			results += changeFor / coins[i];
			reminder = changeFor % coins[i];
			changeFor = reminder;
		}
		return results;
	}

}
