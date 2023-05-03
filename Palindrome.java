package basics;

public class Palindrome
{
	public static void main(String args[])
	{
		System.out.println("----------------------------");
		String s1= "madam";
		String s2="";
		 
		 s1.toLowerCase().trim();	
		for(int i=s1.length()-1; i>=0;  i--)
		{
			 s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println(s1+" is Palindrome..!!");
		}
		else
		{
			System.out.println(s1+" is not Palindrome..!");
		}	
		System.out.println("----------------------------");
	}
}
