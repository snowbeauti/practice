package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		
		double mileput = sc.nextDouble();
		double mile = 1.609;
		double kmiter = mileput * mile;
		
		System.out.print( mileput + "마일은 " + kmiter + "킬로미터 입니다.");
		sc.close();
	}

}
