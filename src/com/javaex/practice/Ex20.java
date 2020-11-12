package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {


	public static void main(String[] agrgs) {
		Scanner sc = new Scanner(System.in);

		System.out.print("500원 개수: ");
		int fiveh = sc.nextInt();
		System.out.print("100원 개수: ");
		int oneh = sc.nextInt();
		System.out.print("50원 개수: ");
		int fifty = sc.nextInt();
		System.out.print("10원 개수: ");
		int ten = sc.nextInt();
		
		int result = (fiveh * 500) + (oneh * 100) + (fifty * 50) + (ten * 10);
		
		System.out.print("동전의 총합은 " + result + "원 입니다.");
		
		sc.close();
	}
}
