package basics;

import java.util.Scanner;  
    
    public class EvenNumber  
    {  
    public static void main(String[] args)   
    {  
    System.out.println("List of even numbers: ");       
    //method calling  
    displayEvenNumbers(15, 30);   
    }   
    //method that checks the number is even or not  
    private static void displayEvenNumbers(int number, int end)   
    {   
    if(number>end)   
    return;   
    if(number%2==0)   
    {   
    //prints the even numbers  
    System.out.print(number +" ");   
    //calling the method and increments the number by 2 if the number is even  
    displayEvenNumbers(number + 2, end);   
    }   
    else   
    {   
    //increments the number by 1 if the number is odd  
    displayEvenNumbers(number + 1, end);   
    }   
    }   
    }  
