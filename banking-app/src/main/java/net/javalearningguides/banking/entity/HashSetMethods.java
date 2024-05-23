package net.javalearningguides.banking.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetMethods {

	public static void main(String[] args) {
		
		Set<Integer> numbers=new HashSet<Integer>();
		Collections.addAll(numbers, 1,2,3,4,5,6,7,8,9,10,11);
		System.out.println(numbers);
		
		//returns boolean value
		System.out.println(numbers.remove(11));
		System.out.println(numbers);
		
		List<Integer> evenNumbers=new ArrayList<Integer>();
		Collections.addAll(evenNumbers, 2,4,6,8,10);
		
		//removes a collection
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);
		
		numbers.clear();
		System.out.println(numbers);
		
		numbers.add(12);
		System.out.println(numbers);
	}

}
