package basics;

import java.util.Scanner;

public class Swap2numbeR
{
	public static void main(String args[])
	{
		System.out.println("-----------------------------");
		System.out.println("*** Swapping Two Number ***");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b=sc.nextInt();
		//By assigning 3rd variable 
//		int c=a;
//			a=b;
//			b=c;
		//Without assigning 3rd variable
			a =a+b;
			b =a-b;
			a =a-b; 
			
		System.out.println("\nThe value of a = "+a);
		System.out.println(  "The value of b = "+b);
		
		System.out.println("-----------------------------");
	}
}
