package com.javaex.practice2;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("첫번째 숫자: ");
		x = sc.nextInt();
		System.out.print("두번째 숫자: ");
		y = sc.nextInt();
		
		if(x==0) {
			System.out.print("0은 계산할 수 없습니다.");
		} else if (y==0) {
			System.out.print("0은 계산할 수 없습니다.");
		} else if(x>y) {
			if(x % y == 0) {
				System.out.print(y + " 는(은) " + x + "의 약수입니다.");
				} else {
				System.out.print(y + " 는(은) " + x + "의 약수가 아닙니다.");
				}
		}else if (y>x) {
				if(y % x == 0) {
					System.out.print(x + " 는(은) " + y + "의 약수입니다.");
				} else {
					System.out.print(x + " 는(은) " + y + "의 약수가 아닙니다.");
				}
		}else if(x == y) {
			System.out.print(x + "과(와) " + y + "는(은) 같은 숫자입니다.");
		}
		
		
		sc.close();
	}

}
