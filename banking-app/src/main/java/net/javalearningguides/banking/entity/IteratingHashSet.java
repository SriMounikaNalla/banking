package net.javalearningguides.banking.entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingHashSet {

	public static void main(String[] args) {
		
		Set<String> courses=new HashSet<>();
		Collections.addAll(courses, "c","Java","Dot Net","JavaScript");
		System.out.println(courses+"courses");
		
		//enhanced for loop
		System.out.println("enhanced for loop");
		for(String course:courses) {
			System.out.println(course);
		}
		
		//Iterator with forloop
		
		System.out.println("Iterator with forloop");
		for(Iterator<String> iterator=courses.iterator();iterator.hasNext();) {
			String crs=(String)iterator.next();
			
			System.out.println(crs);
			}
		//Iterator with whileloop
		System.out.println("Iterator with whileloop");
		Iterator iterator=courses.iterator();
		while(iterator.hasNext()) {
			String crs=(String)iterator.next();
			
			System.out.println(crs);
		}
		
		//jdk8 using forEach+Lambda
		System.out.println("/using forEach+Lambda");
		courses.forEach(course->System.out.println(course));
		
		//jdk8 using stream+filter+forEach++Lambda
		System.out.println("using stream+filter+forEach++Lambda");
		courses.stream().filter(course->!"Java".equals(course))
		.forEach(co->System.out.println(co));

	}

}
