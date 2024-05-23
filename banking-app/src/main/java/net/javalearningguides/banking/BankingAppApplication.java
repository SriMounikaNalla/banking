package net.javalearningguides.banking;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javalearningguides.banking.entity.Employee;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
		System.out.println("--------started");
		LinkedList<String> fruits=new LinkedList<>();
		
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("pomegranate");
		fruits.add("papaya");
		fruits.add("pineapple");
		
		System.out.println("fruits list:"+fruits);
		
		String firstFruit=fruits.getFirst();
		System.out.println("first fruit:"+firstFruit);
		
		String lastFruit=fruits.getLast();
		System.out.println("last fruit:"+lastFruit);
		
		
		String fruitByIndex=fruits.get(2);
		System.out.println("fruit by index:"+fruitByIndex);
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		

}
}
