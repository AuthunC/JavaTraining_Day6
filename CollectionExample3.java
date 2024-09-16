package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExample3 {

	private Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int squaredNum = 0;
		for(int i=0;i<arr.length;i++) {
			squaredNum = arr[i]*arr[i];
			map.put(arr[i], squaredNum);
		}
		return map;
	}
	
	public static void main(String[] args) {
		
		CollectionExample3 c = new CollectionExample3();
		int[] arr= {1,2,3,4,5,6};
		Map<Integer, Integer> squares = c.getSquares(arr);
		Set<Entry<Integer, Integer>> entrySet = squares.entrySet();
		for(Entry<Integer, Integer> x : entrySet) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
