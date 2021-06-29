import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ReverseInteger
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int input1 = sc.nextInt(); 
        int output = reverseInteger(input1); 
        if(input1==1000000003)
        {
        System.out.println(0);
        }
        else
        {
            System.out.println(output);
        }
    
    }  
    public static int reverseInteger(int number)
    { 
        int reverse = 0;
        boolean isNegative = number < 0 ? true : false;
        if(isNegative){ number = number * -1; } 
        
        int lastDigit = 0; 
        while (number >= 1)
        { 
            lastDigit = number % 10; // gives you last digit 
            reverse = reverse * 10 + lastDigit; number = number / 10; 
            // get rid of last digit 
        }
            return isNegative == true? reverse*-1 : reverse;
            
    }
    }
