package com.cts.training.Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElementArray {
	public static void main(String[] args) {
		
		int n;
		int temp=0;
		int loc=0;
		System.out.println(" enter the  number of elements requierd");
		Scanner sc  =new Scanner(System.in);
		n = sc.nextInt();
	// array elements input
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
	}
		System.out.println("elements enterd  is :");
	      for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+"\t");
		
	}
	      System.out.println("\n");
	      
		System.out.println("At which position value you want to insert!?");
		loc = sc.nextInt();
		
		
		// return the original array 
        if ( loc < 0 || loc >= a.length) {  
        	System.out.println("Invalid input");
    }
        if(a == null) {
        	a[0] = sc.nextInt();
    }
  
        // Create another array of size +1 
        int[] anotherArray = new int[a.length + 1]; 
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < a.length; i++) { 
  
            // if the index is 
            // the removal element index 
            if (i == loc) { 
                temp = a[i];
                anotherArray[k++] = sc.nextInt();
                anotherArray[k++] = temp;
            	//continue; 
            } 
            else {
            	anotherArray[k++] = a[i];
            }
            // array element inserted
        } 
        System.out.print( "array after inserstion :");
        for(int i=0;i<n+1;i++) {
			
			System.out.print(anotherArray[i] +"\t");
		
	}
    /*   System.out.println();
		Arrays.sort(anotherArray);
		 System.out.printf(" elements  sorted after insertion array arr[] : %s", Arrays.toString(anotherArray)+"\t");
		
        */
	}
        
	}
	


