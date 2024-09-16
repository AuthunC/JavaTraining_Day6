package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopNFrequentWordsUsingMap{

	public static void topNFrequentWords(List<String> words, int topN) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0;i<words.size();i++) {
        	map.put(words.get(i), map.getOrDefault(words.get(i), 0)+1);
        }
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((x,y) -> y.getValue().compareTo(x.getValue()));
        
        int count = 0;
        for (Entry<String, Integer> entry : entryList) {
            if (count++ < topN) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            } else {
                break;
            }
        }
        
	}
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana",
            "apple", "kiwi", "orange", "kiwi", "kiwi",
            "banana", "banana", "apple", "kiwi", "kiwi","guava"
        );

        int topN = 2;

        topNFrequentWords(words, topN);
	}
    
}