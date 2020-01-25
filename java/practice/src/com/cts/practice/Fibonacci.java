package com.cts.practice;

public class Fibonacci {
	public static void main(String args[]) {
		int n=10,t1=1,t2=2;
		System.out.print("first" +n+ "terms:");
		for(int i=1;i<=n;++i) {
			System.out.print(t1+ "+");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
			
	}

}
