package typecasting;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		
		
		if (num1 % 5 == 0)
		{
			System.out.println(num1+ "  is divisible by 5");
		}
		else {
			System.out.println(num1+ " is not divisible by 5");
		}


	}

}
