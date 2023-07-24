package org.tnsif.decisionmaking;
import java.util.Scanner;
public class cascadedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int age1=scan.nextInt();
		int age2=scan.nextInt();
		int age3=scan.nextInt();
		{
			if(age1>age2 && age1>age3)
			{
				System.out.println("Age is greater"+age1);
			}
			else if(age2>age1 && age2>age3)
			{
				System.out.println("Age is greater"+age2);
				
			}
			else if(age3>age1 && age3>age2)
			{
				System.out.println("Age is greater"+age3);
				
			}
				
		}
		

	}

}
