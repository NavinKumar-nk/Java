package basics;

import java.util.*;

class DistinctCharacter{
 
public static void main(String[] args)
{
    String str = "Navin Kumar V";
 
    for (int i = 0; i < str.length(); i++)
    {
        int flag = 0;
        for (int j = 0; j < str.length(); j++)
        {
            // checking if two characters are equal
            if (str.charAt(i) == str.charAt(j) && i != j)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.print(str.charAt(i));
    }
}
}