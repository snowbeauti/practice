package com.javaex.practice2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		
		
		if(num1>num2) {
			int remainder = num1 % num2;
			int quotient = num1 / num2 - remainder/10;
			
			System.out.println("몫: " + quotient);
			System.out.println("나머지: " + remainder);
			}else if (num1<num2) {
				int remainder = num2 % num1;
				int quotient = num2 / num1 - remainder/10;
				
				System.out.println("몫: " + quotient);
				System.out.println("나머지: " + remainder);
			} else {
				System.out.println("몫: 1");
				System.out.println("나머지: 0");
			}
		
		sc.close();
	}
	
}
