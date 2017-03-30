package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * 
 * Given a List of Integer, find the length of longest sub-list that starts and
 * ends with the same value.
 * 
 * Example:
 * 
 * Consider the input: [2,4,6,8,3,6,5,4,7]
 * 
 * There are two possible non-trivial sub-lists that start and end with same
 * value:
 * 
 * Input: [2,4,6,8,3,6,5,4,7] list1: [4,6,8,3,6,5,4] // starts and ends with
 * value 4, length = 7 list2: [6,8,3,6] // starts and ends with value 6, length
 * = 4
 * 
 * Therefore, should output 7
 * 
 * 2 => (0,?) 4 => (1,7) 6 => (2,5) 8 => (3,?)
 */

public class LargestSubListLengthStrtNEndwSameValue {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(7);

		HashMap<Integer, List<Integer>> map = new HashMap<>();

		for (int i =0;i<list.size();i++) {
			if (map.containsKey(list.get(i))) {
				map.get(list.get(i)).add(i);
			}else{
				List temp = new  ArrayList<>();
				temp.add(i);
				map.put(list.get(i), temp);
			}
		}
		List<Integer> temp= new ArrayList<>();
		for(Entry<Integer,List<Integer>> e : map.entrySet()){
			List<Integer> value = e.getValue();
			  if(value.size()==2){
				  temp.add(value.get(1)-value.get(0)+1);
			  }
		}
		Collections.sort(temp);
		System.out.println(temp.get(temp.size()-1));
	}
}
