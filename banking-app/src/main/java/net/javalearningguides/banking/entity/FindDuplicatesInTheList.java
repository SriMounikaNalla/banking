package net.javalearningguides.banking.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesInTheList {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,2,5,4,6,7,8,1,5);
		System.out.println(list);
		Set<Integer> set=new HashSet<>();
		List<Integer> duplicatList=list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
		System.out.println(duplicatList);
	}

}
