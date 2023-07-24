package org.tnsif.operators;
import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String res=(num%2==0)?"Even":"odd";
		System.out.println("Result is:"+res);
		sc.close();
		

	}

}
