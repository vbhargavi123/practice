package com.cts.practice;
import java.util.Scanner;
public class EvenOdd {
	public static void mian(String args[]) {
		  Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        if(num % 2 == 0) {
	     
	            System.out.println(num + " is even");
	        }
	            else
	            {
	            	System.out.println(num + " is odd");
	    }
	}
	        
		
	}


