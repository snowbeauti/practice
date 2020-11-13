package com.javaex.practice2;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int x;

		
		x = sc.nextInt();
		
		if (x > 0) {
			double result = (7 * x) + 2;
			System.out.print("계산결과는 " + result +"입니다.");
		} else if (x <= 0) {
			double result = Math.pow(x, 3) - (9 * x) + 2;
			System.out.print("계산결과는 " + result +"입니다.");
		}
		
		sc.close();
	}

}
