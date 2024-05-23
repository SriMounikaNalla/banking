package net.javalearningguides.banking.entity;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {

	public static void main(String[] args) {
		
		LinkedList<String> fruits=new LinkedList<>();
		
		fruits.add("banana");//0
		fruits.add("apple");//1
		fruits.add("grapes");//2
		fruits.add("pineapple");//3
		fruits.add("pineapple");//4
		fruits.add("pomegranate");//5
		fruits.add("papaya");//6
		
		System.out.println(fruits+"original list");
		
	//to check element is in the list or not
		boolean outputOne=fruits.contains("grapes");
		System.out.println(outputOne+"outputOne");
		
	//find the index of the first occurence
		int index=fruits.indexOf("pineapple");
		System.out.println(index+"index");
	//find the index of last occurence
		int lastIndex=fruits.lastIndexOf("pineapple");
		System.out.println(lastIndex+"lastIndex");
		
	//Iterating Linked list 
		
	//using iterator
		Iterator<String> iterator= fruits.iterator();
		while(iterator.hasNext()) {
			String fru=(String)iterator.next();
			System.out.println(fru);
			}
		
		
	//foreach
		System.out.println("----------------------");
		fruits.forEach((fru)->{
			System.out.println(fru);
		});
		
	
	//foreach advanced loop
		System.out.println("----------------------");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
	

	}

}
