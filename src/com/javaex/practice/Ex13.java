package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		int won = sc.nextInt();
		double dall = 1230.95;
		double result = won / dall; 
		
		System.out.print("받으실 달러는 " + result + "입니다.");
		sc.close();
	}

}
