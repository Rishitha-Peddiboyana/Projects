package typecasting;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		
		
		if(num1 >= 18)
		{
			System.out.println("Given person is valid for vote");
		}
		else {
			System.out.println("Given Person is invalid for vote");
		}
	}

}
