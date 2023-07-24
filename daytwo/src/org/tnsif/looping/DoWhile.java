package org.tnsif.looping;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		do {
			System.out.println("Value of n is: "+n);
			n++;
			
		}while(n<14);

	}

}
