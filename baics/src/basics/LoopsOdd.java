package typecasting;


import java.util.Scanner;
public class LoopsOdd {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = n.nextInt();
		
		while(i%2 != 0 && i <=50) {
			System.out.println(i+" Number is odd");
			i++;
		}

	}

}
0