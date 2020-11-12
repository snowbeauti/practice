package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("월급을 입력하세요 : ");
		
		int pay = sc.nextInt();
		int result01 = pay * 120;
		
		System.out.print("10년동안 최대 저축액은 " + result01 + "원 입니다.");

		sc.close();
		
	}

}
