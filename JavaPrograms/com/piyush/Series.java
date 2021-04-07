package com.piyush;

public class Series{
	public static void nSum(int n){
		int count = 0;
		for (int i=0; i<=n; i++) {
			System.out.print(count + " ");
			count+=i;
		}
		System.out.println();
	}

	public static void factorial(int n){
		int count = 1;
		for (int i=1; i<=n; i++) {
			System.out.print(count + " ");
			count*=i;
		}
		System.out.println();
	}

	public static void fibonacci(int n){
		int first = 0;
		int second = 1;
		int temp;
		System.out.print(first + " " + second);
		for (int i=0; i<=n; i++) {
			temp = first + second;
			if(temp<n){
				System.out.print(temp + " ");
			}else{
				break;
			}
			first = second;
			second = temp;
		}
	}
}