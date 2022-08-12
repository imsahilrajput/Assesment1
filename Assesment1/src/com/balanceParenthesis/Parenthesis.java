package com.balanceParenthesis;

import java.util.Scanner;


public class Parenthesis {
	public static void main(String[] args) {
		int count =0;
		int flag=0;
		int isParenthesis=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the expression");
		String exp=scanner.nextLine();
		for(int i =0;i<exp.length();i++) {
			if(exp.charAt(i)=='(' ) {
				isParenthesis=1;
				count++;
				if(count<0) {
					flag=1;
					break;
				}
			}else {
				count--;
				if(count<0) {
					flag=1;
					break;
				}
				
			}
		}if(isParenthesis==1) {
			if(flag==0) {
				if(count==0) {
					System.out.println("Parenthesis i.e. () Matching");
				}else {
					System.out.println(" Parenthesis i.e.() not Matching");
				}
				
			}else {
				System.out.println("Parenthesis i.e. () not Matching");
			}
		}else {
			System.out.println("No Parenthesis i.e. () found in expression");
		}
	
		
	}

}
