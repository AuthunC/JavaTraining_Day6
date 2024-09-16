package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CollectionExample1 {
	public List<String> getValues(HashMap<Integer, String> map){
		List<String> l = new ArrayList<String>(map.values());
		Collections.sort(l);
		return l;
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		hash.put(2, "B");
		hash.put(4, "D");
		hash.put(7, "G");
		hash.put(1, "A");
		hash.put(6, "F");
		hash.put(5, "E");
		hash.put(3, "C");
		
		hash.put(10, "K");
		
		CollectionExample1 c = new CollectionExample1();
		List<String> list = c.getValues(hash);
		System.out.println(list);
	}
}
