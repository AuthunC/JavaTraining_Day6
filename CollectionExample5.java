package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Create a method which accepts an array of integer elements and return the second smallest element in the array

//Method Name - getSecondSmallest 
//Method Description - Get the second smallest element in the array 
//Argument - int[] 
//Return Type -	int 
//Logic - Sort the array and return the second smallest element in the array Hint: 
//1. Convert to Array List 2. Use sort method in Collections class 

public class CollectionExample5 {

	private int getSecondSmallest(int[] arr) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int x:arr) {
			list.add(x);
		}
		Collections.sort(list);
		
		return list.get(1);
	}
	public static void main(String[] args) {
		CollectionExample5 c = new CollectionExample5();
		int[] arr= {1,24,22,5,5,4,8};
		int secondSmallest = c.getSecondSmallest(arr);
		System.out.println(secondSmallest);
	}
}
