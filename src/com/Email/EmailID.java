package com.Email;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailID {
	
	public static void main(String[] args) {
		ArrayList <String> list =new ArrayList <String>();
		list.add("nika@gmail.com");
		list.add("rita@gmail.com");
		list.add("viky@gmail.com");
		list.add("neha@gmail.com");
		list.add("mine@gmail.com");
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmailId");
		String input = sc.next();
		boolean flag = false;
		for (String s: list) {
			flag = input.equals(s);
			if(flag == true) {
				System.out.println("Valid");
			break;
			}
		} if(flag == false)
			System.out.println("InValid");
		
		    
	

	}
}


