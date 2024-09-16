package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. 
//A person is eligible for vote if his age is greater than 18. Add the IDs of the eligible persons to list and return the list. 

//Method Name 	votersList 
//Method Description - Generate the list of voters based on the ages of the people 
//Argument 	Map 
//Return Type - List 
//Logic - Accept a map with ID as key and Date of Birth as value and check if the person is eligible to vote. 
//A person is eligible for vote for if his age is greater than 18. If the person is eligible add his ID to the list. 


public class CollectionExample6 {
	private List<Integer> votersList(Map<Integer, Integer> map) {
		List<Integer> l = new ArrayList<Integer>();
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer, Integer> x : entrySet) {
			if(x.getValue() > 18) {
				l.add(x.getKey());
			}
		}
		
		return l;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		CollectionExample6 c = new CollectionExample6();
		
		map.put(101, 22);
		map.put(102, 10);
		map.put(103, 32);
		map.put(104, 66);
		map.put(105, 18);
		map.put(106, 19);
		
		List<Integer> votersList = c.votersList(map);
		for(Integer x : votersList) {
			System.out.println(x);
		}
	}
}
