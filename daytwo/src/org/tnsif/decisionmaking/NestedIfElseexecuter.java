//for bunjee jumping
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedIfElseexecuter {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for Bunjee Jumping");
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
					
				}
			}
			else
			{
				System.out.println("Not Eligible");
				
			}
			else
			{
				System.out.println("you are elible")
			}
		}
		

	}

}
