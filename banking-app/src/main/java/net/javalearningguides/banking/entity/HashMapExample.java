package net.javalearningguides.banking.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> numberMapping=new HashMap<>();
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		numberMapping.put("four", 4);
		numberMapping.put("five", 5);
		System.out.println(numberMapping+"numberMapping");
		numberMapping.put("null", 6);
		numberMapping.put("null", 7);
		
		//hashmap only accept one null key if more null keys added it will override with latest null key and value
		System.out.println(numberMapping);
		
		//check if hashmap is empty
		
		System.out.println(numberMapping.isEmpty()+"check if hashmap is empty");
		
		//find the size of the hashmap
		
		System.out.println(numberMapping.size()+"find the size of the hashmap");
		
		//check if a key exist in the hashmap
		
		if(numberMapping.containsKey("four")) {
			System.out.println("exist");
		}
		else {
			System.out.println("not exist");
		}
		
		//check if a value exist in the hashmap
		
				if(numberMapping.containsValue(31)) {
					System.out.println("exist");
				}
				else {
					System.out.println("not exist");
				}
		
		//get value by key
		
		Integer v1=numberMapping.get("two");
		
		System.out.println(v1);
		
		//how to remove keys from hashmap
		numberMapping.remove("three");
		System.out.println(numberMapping);
		
		//get only keys from hashmap
		Set<String> keys=numberMapping.keySet();
		System.out.println(keys);
		
		//get only values from hashmap
		Collection<Integer> values=numberMapping.values();
		System.out.println(values);
		}

}
