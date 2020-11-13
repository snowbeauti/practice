package com.javaex.practice2;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int num;
		num = sc.nextInt();
		
		if (num > 0) {
			double result = (7 * num) + 2;
			System.out.print("계산결과는 " + result +"입니다.");
		} else if (num <= 0) {
			double result = (num * num * num) - (9 * num) + 2;
			System.out.print("계산결과는 " + result +"입니다.");
		}
		
		sc.close();
	}

}
