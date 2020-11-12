package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		double volume = (r * r * r) * 3.14 * 4 / 3;
		
		System.out.print("구의부피는: " + volume + " 입니다.");
		
		sc.close();
	}

}
