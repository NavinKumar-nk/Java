package basics;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
	 Scanner s1 = new Scanner(System.in);
	 System.out.println("Enter String to Reverse : ");
	 String str = s1.nextLine();
	 String rev = "";
	 for(int i = str.length() - 1; i >= 0; i--)
	 {
		 rev = rev + str.charAt(i);
	 }	 
	 System.out.println("\nThe Reversed String is : ");
	 System.out.println(rev);
	 }
}