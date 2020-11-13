package com.javaex.practice2;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		
		String mark;
		System.out.print("기호: ");
		mark = sc.next();
		
		int num1;
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		
		int num2;
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		double result;
		
		switch (mark) {
		case "/": 
			if(num2 == 0) {
				System.out.print("계산할 수 없습니다.");
			} else {
				result = num1 / num2;
				System.out.print("결과는: " + result);
			}
			break;
		case "+": 
			result = num1 + num2;
			System.out.print("결과는: " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.print("결과는: " + result);
			break;
		case "*": 
			result =num1 * num2;
			System.out.print("결과는: " + result);
		break;	
		
		default:
		System.out.print("계산 할 수 없는 기호입니다.");
		break;
		}
		
		sc.close();
	}

}
