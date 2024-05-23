package net.javalearningguides.banking.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {
		
		//first five even numbers
		List<Integer> firstFiveEvenNumbers=new ArrayList<>();
		Collections.addAll(firstFiveEvenNumbers, 2,4,6,8,10);
		System.out.println(firstFiveEvenNumbers);
		
		//create a hashset from another collection using the HashSet(Collection c) constructor
		Set<Integer> tenEvenNumbers=new HashSet<>(firstFiveEvenNumbers);
		System.out.println(tenEvenNumbers);
		Collections.addAll(tenEvenNumbers, 12,14,16,18,20);
		System.out.println(tenEvenNumbers);
		
		List<Integer> nextEvenNumbers=new ArrayList<>();
		Collections.addAll(nextEvenNumbers, 22,24,26,28,30);
		System.out.println(nextEvenNumbers+"nextEvenNumbers");
		
		//add all the elements from a collection to the HashSet using the addAll() method
		
		Set<Integer> allEvenNumbers=new HashSet<>();
		allEvenNumbers.addAll(nextEvenNumbers);
		System.out.println(allEvenNumbers+"allEvenNumbers");
	}

}
