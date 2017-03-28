package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kranthi
 * 
 */

public class MinCoinChangeSoultion {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] coins = { 1, 2, 3, 5 };
	int changeFor = 4;
	Map<String, Long> results = new HashMap<>();
	minChange(changeFor, coins, 0, results);
	System.out.println(minChange(changeFor, coins, 0, results));
    }

    private static long minChange(int money, int[] coins, int index, Map<String, Long> memo) {

	// run out of money return 1;
	if (money == 0)
	    return 1;
	if (index >= coins.length)
	    return 0;

	// run out of coins return 0;
	String key = money + " - " + coins[index];
	if (memo.containsKey(key)) {
	    return memo.get(key);
	}
	long ways = 0;
	int amountWithCoins = 0;
	while (amountWithCoins <= money) {
	    int remaining = money - amountWithCoins;
	    ways += minChange(remaining, coins, index + 1, memo);
	    amountWithCoins += coins[index];
	}
	memo.put(key, ways);
	return ways;
    }

}
