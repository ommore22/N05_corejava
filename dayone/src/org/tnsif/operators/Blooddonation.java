package org.tnsif.operators;
import java.util.Scanner;

public class Blooddonation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age :");
		int age=sc.nextInt();
		System.out.println("enter your weight :");
		int weight=sc.nextInt();
		
		if (age>=18&&weight>=50)
	{
			System.out.println("you are eligible to donate blood");
		}
		else
			System.out.println("you are not eligible to donate blood");
		
		
		

	}

}
