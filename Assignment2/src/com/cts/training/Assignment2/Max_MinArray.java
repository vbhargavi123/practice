package com.cts.training.Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class Max_MinArray {

	public static void main(String[] args) {
		int n;
		System.out.println("enter number of elements required");
		Scanner sc  =new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		int[] sorta = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		
		}
		System.out.println("  array  elements before sorted : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		Arrays.sort(a);
		
		System.out.println(" array elements after shorting  " +Arrays.toString( a));
		 System.out.println(" \n");
		 System.out.println("Minimum number in array  is   " + a[0]);
		 System.out.println("Maximum number in array  is   " + a[n-1]);
	}



}
