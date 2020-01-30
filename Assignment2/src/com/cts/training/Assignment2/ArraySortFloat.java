package com.cts.training.Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortFloat {
	public static void main(String [] args) {
		int n;
		System.out.println("enter number of elements required");
		Scanner sc  =new Scanner(System.in);
		n = sc.nextInt();
		float[] a = new float[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextFloat();
		}
		System.out.println("element before sorting is :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		Arrays.sort(a);
		 System.out.printf(" elements after sorting float arr[] : %s", Arrays.toString(a));
		
		
	}



}
