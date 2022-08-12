package com.arrayTarget;

import java.util.Scanner;

public class ArrayTarget {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int flag=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the target");
		int target = scanner.nextInt();
		for(int i =0 ;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]== target) {
					flag=1;
					System.out.println(i+","+j);
				}
			}
		}
		if(flag==0) {
			System.out.println("No indices found");

		}

		
	}

}
