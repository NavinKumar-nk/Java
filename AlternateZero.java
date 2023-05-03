package basics;

import java.util.Scanner;

public class AlternateZero
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) 
        {
            if (i % 2 == 0)
            {
                System.out.print("0 ");
            } 
            else
            {
                System.out.print(i + " ");
            }
        }
    }
}
