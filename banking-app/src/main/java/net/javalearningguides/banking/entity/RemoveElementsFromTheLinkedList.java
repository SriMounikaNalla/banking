package net.javalearningguides.banking.entity;

import java.util.LinkedList;

public class RemoveElementsFromTheLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> fruits=new LinkedList<>();

		fruits.add("banana");
		fruits.add("apple");
		fruits.add("papaya");
		fruits.add("pomegranate");
		System.out.println(fruits);
		
		//remove the first element
		String rFirst=fruits.removeFirst();
		System.out.println(fruits+"after removing first");
		
		//remove the last element
				String rLast=fruits.removeLast();
				System.out.println(fruits+"after removing last");
				
		//remove the first occurence of given element
			fruits.remove();
			System.out.println(fruits);
		
			fruits.add("pineapple");
			fruits.add("guava");
			System.out.println(fruits);
			fruits.remove(1);
			System.out.println(fruits);
			
			fruits.remove("papaya");
			System.out.println(fruits);
			//we use clear method to clear the entire list
			fruits.clear();
			System.out.println(fruits);
	}

}
