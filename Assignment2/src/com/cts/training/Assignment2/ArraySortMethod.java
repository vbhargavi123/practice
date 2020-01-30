package com.cts.training.Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortMethod {

	public static void main(String[] args) {
		int n;
		System.out.println("enter number of elements required");
		Scanner num =new Scanner(System.in);
		n = num.nextInt();
		int[] a = new int[n];
		int[] sorta = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = num.nextInt();
			
		}
		System.out.println("elements before sorting  is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		Arrays.sort(a);
		 System.out.printf(" elements after sorting arr[] : %s", Arrays.toString(a));
		

	}


}
