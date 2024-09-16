package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExample2 {
	private Map<Character, Integer> countchars(char[] arr) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char x: arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		return map;
	}

	public static void main(String[] args) {
		CollectionExample2 c = new CollectionExample2();
		char[] arr = { 'a', 'b', 'c', 'd', 'a', 'a', 'd', 'b', 'e', 'a', 'c' };
		Map<Character, Integer> answer = c.countchars(arr);
		Set<Entry<Character, Integer>> entrySet = answer.entrySet();
		for (Entry<Character, Integer> x : entrySet) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
