package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double price = sc.nextInt();
		System.out.print("받은돈: ");
		double getmoney = sc.nextInt();
		System.out.print("=========================\n");
		
		double tax = price * 0.1;
		double change = getmoney - price;
		
		System.out.println("받은돈: " + getmoney);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + tax);
		System.out.println("잔액: " + change);
		
		
		sc.close();
	}
}
