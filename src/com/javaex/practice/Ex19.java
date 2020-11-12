package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] agrgs) {
		Scanner sc = new Scanner(System.in);
		
		long result = (long) 300000 * 365 * 24 * 60;
		System.out.print("빛이 1년 동안 가는 거리는 " + result +"km 입니다.");

		sc.close();
	}
}
