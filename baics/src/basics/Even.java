package typecasting;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = scanner.nextInt();
		
		
		
		if(num1 % 2==0){
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}

}
