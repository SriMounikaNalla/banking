package net.javalearningguides.banking.entity;

import java.util.Scanner;

public class FindThePower {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Base value:");
		int B=sc.nextInt();
		System.out.println("enter power value:");
		int P=sc.nextInt();
		int answer=power(B,P);
		System.out.println("power of " +B+ " and "+ P +"is: "+answer);
		
	}

	private static int power(int b, int p) {
		
		int power=1;
		for(int i=0;i<p;i++) {
			power=power*b;
		}
		return power;
	}
}
