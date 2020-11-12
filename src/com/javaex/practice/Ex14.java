package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double street = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double colum = sc.nextDouble();
		
		double area = street * colum;
		double periphery = (street + colum) * 2;
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + periphery);
		
		sc.close();
	}

}
