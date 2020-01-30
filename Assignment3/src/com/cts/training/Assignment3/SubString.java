package com.cts.training.Assignment3;
import java.util.Arrays;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		String str = null;
		System.out.println("enter the string to split");
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		String[] arrOfStr = str.trim().split("\\s+"); 
		for(int i=0;i<arrOfStr.length;i++) {
			System.out.println(arrOfStr[i]);
		}
		//System.out.println("output string: " + Arrays.toString(arrOfStr));
	}

}



