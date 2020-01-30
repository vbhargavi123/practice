package com.cts.training.Assignment3;
import java.util.Scanner;

public class Pallindromecheck {
	static boolean isPalindrome(String str) 
    { 
  
      
        int i = 0, j = str.length() - 1; 
  
        // While there are characters  compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
           
            i++; 
            j--; 
        } 
  
        
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "";
        System.out.println("enter the string to check");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 


}
