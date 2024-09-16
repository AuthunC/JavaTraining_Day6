package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//school offers medals to the students of tenth based on the following criteria 
//If(Marks>=90) : Gold 
//If(Marks between 80 and 90) : Silver 
//If(Marks between 70 and 80) : Bronze 
//Note: Marks between 80 and 90 means marks>=80 and marks<90 

public class CollectionExample4 {

	private Map<Integer, String> getStudents(Map<Integer, Integer> inputMap) {
		Map<Integer, String> outputMap = new HashMap<Integer, String>();

		Set<Entry<Integer, Integer>> entrySet = inputMap.entrySet();
		for (Entry<Integer, Integer> x : entrySet) {
			Integer studentId = x.getKey();
			Integer studMarks = x.getValue();
			
			String medal;
			if(studMarks >= 90) {
				medal = "Gold";
				outputMap.put(studentId, medal);
			}
			else if(studMarks >= 80 && studMarks < 90) {
				medal = "Silver";
				outputMap.put(studentId, medal);
			}
			else if(studMarks >= 70 && studMarks <80) {
				medal = "Bronze";
				outputMap.put(studentId, medal);
			}
			else {
				continue;
			}	
		}

		return outputMap;
	}

	public static void main(String[] args) {

		CollectionExample4 c = new CollectionExample4();
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		inputMap.put(1, 97);
		inputMap.put(2, 72);
		inputMap.put(3, 88);
		inputMap.put(4, 61);
		inputMap.put(5, 93);
		inputMap.put(6, 97);
		inputMap.put(7, 77);

		Map<Integer, String> outputMap = c.getStudents(inputMap);
		Set<Entry<Integer, String>> entrySet = outputMap.entrySet();
		for (Entry<Integer, String> x : entrySet) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
