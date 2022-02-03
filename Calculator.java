package com.typecaste;

import java.util.Scanner;

public class Typecaste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = scanner.nextInt();
		System.out.println("enter second number");
		int num2 = scanner.nextInt();
		System.out.println("enter number");
		int n = scanner.nextInt();
		if (n==1){
			System.out.println(num1+num2);
		}
		else if(n==2) {
			if(num1>num2) {
				System.out.println(num1-num2);
			}
			else{
				System.out.println(num2-num1);
			}
		}
		else if(n==3) {
			System.out.println(num1*num2);
		}
		else if(n==4) {
			if(num1>num2) {
				System.out.println(num1/num2);
			}
			else {
			System.out.println(num2/num1);
			}
		}
		
	}

}
