package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		
		int hround = sc.nextInt();
		double result = hround * hround * 3.14;
		
		System.out.print("원의 넓이는 " + result);
		
		
		sc.close();
	}

}
