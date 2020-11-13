package com.javaex.practice2;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번: ");
		int num;
		num = sc.nextInt();
		
		if (num == 0) {
			System.out.print("존재하지 않는 사번입니다.");
		}else if(num % 3 == 0) {
			System.out.print("A팀 입니다.");
		}else if(num % 3 == 1) {
			System.out.print("B팀 입니다.");
		}else if(num % 3 == 2) {
			System.out.print("C팀 입니다.");
		} 
	
		
		
		sc.close();
	}

}
